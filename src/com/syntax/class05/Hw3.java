package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
 */
public class Hw3 {
    public static String url="http://ebay.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement categoriesDD= driver.findElement(By.cssSelector("select[id= 'gh-cat']"));
        Select select=new Select(categoriesDD);
        List<WebElement> options=select.getOptions();
        //print categories
        for(WebElement option:options) {
            String optionText = option.getText();
            System.out.println(optionText);
        }
        //Select computer.tablets
        select.selectByVisibleText("Computers/Tablets & Networking");
        WebElement search= driver.findElement(By.xpath("//input [@type='submit']"));
        search.click();

        // header verifying
        WebElement header=driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
        if(header.isDisplayed()){
            System.out.println("Header is displayed and verified");
        }else{
            System.out.println("Header not verified");
        }

    }
}

