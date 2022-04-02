package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class review02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleButton= driver.findElement(By.xpath("//input [@value='Female' and @name= 'optradio']"));
        //check if the radio button is enabled
        System.out.println("The female radio button is enabled "+femaleButton.isEnabled());
        //check if the radiobutton is displayed
        System.out.println("The female radio button is displayed "+femaleButton.isDisplayed());
        //check it is selected or not
        System.out.println("The female radio button is selected "+femaleButton.isSelected());

        //check if the button is not selected and select it
        if (!femaleButton.isSelected()){
            femaleButton.click();
        }
        //check the status of selection again
        System.out.println("The female radio button is selected "+femaleButton.isSelected());

        //to get all the links in the current webpage
        List<WebElement> links= driver.findElements(By.tagName("a"));

        for(WebElement link:links){
            System.out.println("link.getText()");
            String name=link.getText();
            if(!name.isEmpty()){
                System.out.println(name);

            }

        }

    }
}
