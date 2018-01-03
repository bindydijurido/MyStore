package pageObjects;

import org.openqa.selenium.By;

public class LoginForms {

    public static By loginEmail() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input");
    }

    public static By loginPsswd() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input");
    }
}
