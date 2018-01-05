package jUnitTests;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pageObjects.Shorts;

import static pageObjects.Buttons.addToCartBttn;
import static pageObjects.Buttons.basketNextBttn;
import static pageObjects.Buttons.proceedToCheckoutBttn;
import static pageObjects.Fields.productField;

public class AddProductToBasket extends Shorts{

    @Test
    public void addRandomProductToBasket() {

        openMainMenu();
        let(productField()).click();
        let(addToCartBttn()).click();
        let(proceedToCheckoutBttn()).click();
        let(basketNextBttn()).click();

    }
}
