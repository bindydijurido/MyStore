package actions;

import pageObjects.Shorts;

import java.text.SimpleDateFormat;
import java.util.Date;

import static pageObjects.Buttons.createAccountBttn;
import static pageObjects.Fields.singInButton;
import static pageObjects.RegistrationForms.emailAddressField;


public class CreateAccount extends Shorts {

    public static void registerUser() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        String timeStamp = dateFormat.format(new Date());

        openMainMenu();
        let(singInButton()).click();
        let(emailAddressField()).sendKeys("test" + timeStamp + "@gmail.com");
        let(createAccountBttn()).click();
    }
}
