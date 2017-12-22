package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.Shorts;

public class OpenMyStore extends Shorts {

    @Test
    public void openSite() {
        openMainMenu();
        Assert.assertEquals(driver.getTitle(), "My Store");
    }
}
