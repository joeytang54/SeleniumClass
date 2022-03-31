package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Method 1 by index
        //driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 12 forever! ");

        driver.switchTo().defaultContent(); //switch back to main page

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        //method 2 by
        driver.switchTo().frame("iframe_a"); //switch back to frame
        textbox.clear();// we need to clear the previous text in textbox before inputting new one
        textbox.sendKeys("we are back to frame");

        driver.switchTo().defaultContent();

        //Method 3
        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("hold your horses");



    }
}
