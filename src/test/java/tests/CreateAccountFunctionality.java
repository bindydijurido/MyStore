package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.RegistrationForms;
import utility.Root;

import static pageObjects.Headers.yourPersonalInfo;
import static pageObjects.Shorts.let;


public class CreateAccountFunctionality extends Root {

    @Test
    public void enterToRegisterUserForm() {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        actions.CreateAccount.registerUser();
        wait.until(ExpectedConditions.visibilityOf(let(RegistrationForms.firstNameForm())));

        Assert.assertEquals(let(yourPersonalInfo()).getText(), "YOUR PERSONAL INFORMATION");
    }

    @Test
    public void fillPersonalInfo() {

        actions.CreateAccount.registerUser();
        actions.FillRegistrationForm.fillPersonalInformation(true, true, true, "Jan", "Kowalski", "test1234", "23",
                                                             "January", "1998");
        actions.FillRegistrationForm.fillAddress("Firma", "Testowa", "22", "Warsaw", "Alabama", "12345",
                                                 "United States", "additionalInfo", "513513513", "513513513",
                                                 "513513513");
        let(pageObjects.Buttons.registerBttn()).click();

        Assert.assertEquals(driver.getTitle(), "My account - My Store");
    }
}
