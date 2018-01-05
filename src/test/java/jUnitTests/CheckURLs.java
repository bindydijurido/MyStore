package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.Shorts;
import pageObjects.URLs;

public class CheckURLs extends Shorts {

    @Test
    public void checkWomenURL() {
        openMainMenu();
        let(URLs.womenURL()).click();

        Assert.assertEquals(driver.getTitle(), "Women - My Store");
    }

    @Test
    public void checkSpecialsURL() {
        openMainMenu();
        let(URLs.specialsURL()).click();

        Assert.assertEquals(driver.getTitle(), "Prices drop - My Store");
    }

    @Test
    public void checkNewProductsURL() {
        openMainMenu();
        let(URLs.newProductsURL()).click();

        Assert.assertEquals(driver.getTitle(), "New products - My Store");
    }

    @Test
    public void checkBestSellersURL() {
        openMainMenu();
        let(URLs.bestSellersURL()).click();

        Assert.assertEquals(driver.getTitle(), "Best sales - My Store");
    }

    @Test
    public void checkOurStoresURL() {
        openMainMenu();
        let(URLs.ourStoresURL()).click();

        Assert.assertEquals(driver.getTitle(), "Stores - My Store");
    }

    @Test
    public void checkContactUsURL() {
        openMainMenu();
        let(URLs.contactUsURL()).click();

        Assert.assertEquals(driver.getTitle(), "Contact us - My Store");
    }

    @Test
    public void checkTermsURL() {
        openMainMenu();
        let(URLs.termsURL()).click();

        Assert.assertEquals(driver.getTitle(), "Terms and conditions of use - My Store");
    }

    @Test
    public void checkAboutUsURL() {
        openMainMenu();
        let(URLs.aboutUsURL()).click();

        Assert.assertEquals(driver.getTitle(), "About us - My Store");
    }

    @Test
    public void checkSiteMapURL() {
        openMainMenu();
        let(URLs.siteMapURL()).click();

        Assert.assertEquals(driver.getTitle(), "Sitemap - My Store");
    }

    @Test
    public void checkMyOrdersURL() {
        openMainMenu();
        let(URLs.myOrders()).click();

        Assert.assertEquals(driver.getTitle(), "Login - My Store");
    }

    @Test
    public void checkMyCreditSlipsURL() {
        openMainMenu();
        let(URLs.myCreditSlipsURL()).click();

        Assert.assertEquals(driver.getTitle(), "Login - My Store");
    }

    @Test
    public void checkMyAddressesURL() {
        openMainMenu();
        let(URLs.myAdressesURL()).click();

        Assert.assertEquals(driver.getTitle(), "Login - My Store");
    }

    @Test
    public void checkMyPersonalInfoURL() {
        openMainMenu();
        let(URLs.myPersonalInfoURL()).click();

        Assert.assertEquals(driver.getTitle(), "Login - My Store");
    }
}
