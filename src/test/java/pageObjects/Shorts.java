package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Root;

public class Shorts extends Root{

    public static void openMainMenu() {
        driver.get("http://automationpractice.com/index.php");
    }

    protected static void log(String element) {
        System.out.println(element);
    }

    public static WebElement let(By locator) {
        return driver.findElement(locator);
    }
}