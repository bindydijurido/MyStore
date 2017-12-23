package pageObjects;

import org.openqa.selenium.By;
import utility.Root;

public class Fields extends Root {

    public static void openMainMenu() {
        driver.get("http://automationpractice.com/index.php");
    }

    public static By searchField() {
        return By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[4]");
    }

    public static By logoImg() {
        return By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[1]/a/img");
    }

    public static By singInButton() {
        return By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a");
    }

    public static By emailAddressField() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input");
    }
}