package pageObjects;

import org.openqa.selenium.By;
import utility.Root;

public class Headers extends Root {

    public static By yourPersonalInfo() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/h3");
    }

}