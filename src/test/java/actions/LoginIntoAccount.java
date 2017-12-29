package actions;

import pageObjects.Shorts;

import static pageObjects.Fields.singInButton;
import static pageObjects.LoginForms.loginEmail;
import static pageObjects.LoginForms.loginPsswd;

public class LoginIntoAccount extends Shorts{

    public static void loginUser(String loginEmail, String loginPsswd) {

        pageObjects.Shorts.openMainMenu();
        let(singInButton()).click();
        let(loginEmail()).sendKeys(loginEmail);
        let(loginPsswd()).sendKeys(loginPsswd);
        let(singInButton()).click();
    }
}
