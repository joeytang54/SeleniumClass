package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*
     * 1. launch the browser
     * 2. navigate to amazon website
     * 3. print out the title and the url in the console
     * 4. close the browser
     */
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//driver, path

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
