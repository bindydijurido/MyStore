package jUnitTests;

import org.junit.Test;
import pageObjects.Buttons;
import pageObjects.Shorts;

import static storage.Variables.ACCOUNT_PSSWD;

public class LoginAccountFunctionality extends Shorts {

    private final String accountName = storage.Variables.getUniqueAccountName();

    @Test
    public void logIntoExistsAccount() {

        actions.CreateAccount.createAccount(accountName);
        let(Buttons.signOutBttn()).click();
        actions.LoginIntoAccount.loginUser(accountName, ACCOUNT_PSSWD);

        log("Test result: OK. Login: " + accountName + ", Password: " + ACCOUNT_PSSWD);
    }
}
