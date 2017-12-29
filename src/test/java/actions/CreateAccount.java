package actions;

import pageObjects.Shorts;

import static pageObjects.Buttons.createAccountBttn;
import static pageObjects.Fields.singInButton;
import static pageObjects.RegistrationForms.emailAddressField;
import static storage.Variables.ACCOUNT_PSSWD;

public class CreateAccount extends Shorts {

    public static void registerUser(String accountName) {

        openMainMenu();
        let(singInButton()).click();
        let(emailAddressField()).sendKeys(accountName);
        let(createAccountBttn()).click();
    }

    public static void repeatUserLogin() {
        openMainMenu();
        let(singInButton()).click();
        let(emailAddressField()).sendKeys("test@gmail.com");
        let(createAccountBttn()).click();
    }

    public static void createAccount(String accountName) {

        actions.CreateAccount.registerUser(accountName);
        actions.FillRegistrationForm
                .fillPersonalInformation(true, true, true, "Jan", "Kowalski", ACCOUNT_PSSWD, "23", "January", "1998");
        actions.FillRegistrationForm
                .fillAddress("Firma", "Testowa", "22", "Warsaw", "Alabama", "12345", "United States", "additionalInfo",
                             "513513513", "513513513", "513513513");
        let(pageObjects.Buttons.registerBttn()).click();
    }
}
