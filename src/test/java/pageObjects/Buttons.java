package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Root;

public class Buttons extends Root {

    public static By searchBttn() {
        return By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button");
    }

    public static By createAccountBttn() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button");
    }

    public static By registerBttn() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[4]/button");
    }

    public static By signInBttn() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button");
    }
}
