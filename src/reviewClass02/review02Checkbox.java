package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class review02Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("hhttps://www.syntaxprojects.com/basic-checkbox-demo.php");
        //check the checkbox
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("The checkbox is selected " + checkbox1.isSelected());
        //select the checkbox
        checkbox1.click();
        WebElement message1 = driver.findElement(By.id("txtAge"));
        System.out.println(message1.getText());
        Thread.sleep(2000);
        //deselect the checkbox
        checkbox1.click();

        //get all the available options
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        Thread.sleep(2000);
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
    }

    }

