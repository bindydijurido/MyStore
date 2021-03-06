package jUnitTests;

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

        actions.CreateAccount.registerUser(storage.Variables.getUniqueAccountName());
        wait.until(ExpectedConditions.visibilityOf(let(RegistrationForms.firstNameForm())));

        Assert.assertEquals(let(yourPersonalInfo()).getText(), "YOUR PERSONAL INFORMATION");
    }

    @Test
    public void wrongRegisterLogin() {

        actions.CreateAccount.repeatUserLogin();

        Assert.assertEquals(let(RegistrationForms.createAccountError()).getText(),
                            "An account using this email address has already been registered. Please enter a valid "
                                    + "password or request a new one.");

    }

    @Test
    public void fillPersonalInfo() {

        actions.CreateAccount.createAccount(storage.Variables.getUniqueAccountName());
        Assert.assertEquals(driver.getTitle(), "My account - My Store");
    }

    @Test
    public void checkRegistrationFormAlerts() {

        actions.CreateAccount.registerUser(storage.Variables.getUniqueAccountName());
        let(pageObjects.Buttons.registerBttn()).click();

        Assert.assertEquals(let(RegistrationForms.lackOfPhoneNr()).getText(),
                            "You must register at least one phone " + "number.");
        Assert.assertEquals(let(RegistrationForms.lackOfLastName()).getText(), "lastname is required.");
        Assert.assertEquals(let(RegistrationForms.lackOfFirstName()).getText(), "firstname is required.");
        Assert.assertEquals(let(RegistrationForms.lackOfPsswd()).getText(), "passwd is required.");
        Assert.assertEquals(let(RegistrationForms.lackOfAddress()).getText(), "address1 is required.");
        Assert.assertEquals(let(RegistrationForms.lackOfCity()).getText(), "city is required.");
        Assert.assertEquals(let(RegistrationForms.lackOfZip()).getText(),
                            "The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
        Assert.assertEquals(let(RegistrationForms.lackOfState()).getText(),
                            "This country requires you to choose a State.");
    }
}
