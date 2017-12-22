package pageObjects;

import org.openqa.selenium.By;
import utility.Root;

public class URLs extends Root {

    public static By womenURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[2]/div/div/ul/li/a");
    }

    public static By specialsURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[1]/a");
    }

    public static By newProductsURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[2]/a");
    }

    public static By bestSellersURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[3]/a");
    }

    public static By ourStoresURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[4]/a");
    }

    public static By contactUsURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[5]/a");
    }

    public static By termsURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[6]/a");
    }

    public static By aboutUsURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[7]/a");
    }

    public static By siteMapURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[3]/ul/li[8]/a");
    }

    public static By myOrders() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[5]/div/ul/li[1]/a");
    }

    public static By myCreditSlipsURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[5]/div/ul/li[2]/a");
    }

    public static By myAdressesURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[5]/div/ul/li[3]/a");
    }

    public static By myPersonalInfoURL() {
        return By.xpath("html/body/div[1]/div[3]/footer/div/section[5]/div/ul/li[4]/a");
    }
}
