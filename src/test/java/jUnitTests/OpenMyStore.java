package jUnitTests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.Shorts;
import utility.Root;

public class OpenMyStore extends Shorts {

    @Test
    public void openSite() {
        openMainMenu();

        Assert.assertEquals(driver.getTitle(), "My Store");
    }
}
