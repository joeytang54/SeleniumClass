package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
 */
public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);
        //Month
        WebElement monthDD= driver.findElement(By.id("month"));
        Select selectM=new Select(monthDD);
        List<WebElement> monthOption=selectM.getOptions();
        int sizeM =monthOption.size();
        if (monthOption.size()==12){
            System.out.println("Month 12 options VERIFIED");
        }else {
            System.out.println("Month options NOT VERIFIED");
        }
        //Day
        WebElement dayDD= driver.findElement(By.id("day"));
        Select selectD=new Select(dayDD);
        List<WebElement> dayOption=selectD.getOptions();
        int sizeD =dayOption.size();
        if (dayOption.size()==31){
            System.out.println("Day 31 options VERIFIED");
        }else {
            System.out.println("Day 31 options NOT VERIFIED");
        }
        //year
        WebElement yearDD= driver.findElement(By.id("year"));
        Select selectY=new Select(yearDD);
        List<WebElement> yearOption=selectY.getOptions();
        int sizeY =yearOption.size();
        if (yearOption.size()==115){
            System.out.println("Year 115 options VERIFIED");
        }else {
            System.out.println("Year 115 options NOT VERIFIED");
        }
        selectM.selectByVisibleText("May");
        selectD.selectByIndex(3);
        selectY.selectByValue("1990");

        driver.quit();



    }
}
