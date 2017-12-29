package actions;

import pageObjects.Shorts;

import static pageObjects.Buttons.createAccountBttn;
import static pageObjects.Fields.singInButton;
import static pageObjects.RegistrationForms.emailAddressField;

public class CreateAccount extends Shorts {

    public static void registerUser() {

        openMainMenu();
        let(singInButton()).click();
        let(emailAddressField()).sendKeys(storage.Variables.getUniqueAccountName());
        let(createAccountBttn()).click();
    }

    public static void repeatUserLogin() {
        openMainMenu();
        let(singInButton()).click();
        let(emailAddressField()).sendKeys("test@gmail.com");
        let(createAccountBttn()).click();
    }
}
