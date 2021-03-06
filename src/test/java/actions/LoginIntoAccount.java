package actions;

import pageObjects.Shorts;
import utility.Root;

import static pageObjects.Fields.logInButton;
import static pageObjects.Fields.singInButton;
import static pageObjects.LoginForms.loginEmail;
import static pageObjects.LoginForms.loginPsswd;

public class LoginIntoAccount extends Shorts {

    public static void loginUser(String loginEmail, String loginPsswd) {

        pageObjects.Shorts.openMainMenu();
        let(singInButton()).click();
        let(loginEmail()).sendKeys(loginEmail);
        let(loginPsswd()).sendKeys(loginPsswd);
        let(logInButton()).click();
    }
}
