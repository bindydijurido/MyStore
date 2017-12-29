package tests;

import org.junit.Test;

import static storage.Variables.ACCOUNT_PSSWD;


public class LoginAccountFunctionality {

    @Test
    public void loginIntoAccount() {

    actions.LoginIntoAccount.loginUser(storage.Variables.getUniqueAccountName(), ACCOUNT_PSSWD);

    }
}
