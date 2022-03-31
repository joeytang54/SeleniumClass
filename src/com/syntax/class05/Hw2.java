package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
Go to facebook sign up page
Fill out the whole form
Click signup
 */
public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);

        WebElement fName = driver.findElement(By.cssSelector("input[name='firstname']"));
        fName.sendKeys("Joey");
        WebElement lName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lName.sendKeys("Tang");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("joeytang@yahoo.com");
        WebElement emailConfirm = driver.findElement(By.xpath("//input [@name='reg_email_confirmation__']"));
        emailConfirm.sendKeys("joeytang@yahoo.com");
        WebElement password = driver.findElement(By.xpath("//input[@id ='password_step_input']"));
        password.sendKeys("123@abc");
        //month
        WebElement monthDD = driver.findElement(By.id("month"));
        Select selectM = new Select(monthDD);
        List<WebElement> monthOptions = selectM.getOptions();
        int monthSize = monthOptions.size();
        for (int i = 0; i < monthSize; i++) {
            selectM.selectByIndex(4);
        }
        //day
        WebElement dayDD=driver.findElement(By.id("day"));
        Select selectD=new Select(dayDD);
        List<WebElement> dayOptions=selectD.getOptions();
        int daySize =dayOptions.size();
        for (int j=0; j<daySize; j++){
            selectD.selectByIndex(3);
        }
        //year
        WebElement yearDD= driver.findElement(By.id("year"));
        Select selectY=new Select(yearDD);
        List<WebElement> yearOptions=selectY.getOptions();
        int yearSize= yearOptions.size();
        for (int k=0; k<yearSize; k++){
            selectY.selectByValue("1990");
        }
        //gender
        WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
        gender.click();
        Thread.sleep(1000);

        WebElement submitButton=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
        submitButton.click();

        driver.quit();
        }
    }

