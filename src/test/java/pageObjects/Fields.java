package pageObjects;

import org.openqa.selenium.By;
import utility.Root;

public class Fields extends Root {

    public static By singInButton() {
        return By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a");
    }

    public static By logInButton() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button");
    }

}