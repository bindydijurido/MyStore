package tests;

import actions.LoginIntoAccount;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.Buttons;
import pageObjects.Shorts;

import static actions.CreateAccount.createAccount;
import static org.junit.Assert.*;
import static pageObjects.Buttons.signOutBttn;
import static pageObjects.Headers.userHeader;
import static storage.Variables.ACCOUNT_PSSWD;

public class LoginFunctionality extends Shorts {

    private final String accountName = storage.Variables.getUniqueAccountName();

    @Given("^The user is creating an account$")
    public void theUserIsCreatingAnAccount() {
        createAccount(accountName);
    }

    @And("^The user logged out from previously created account$")
    public void theUserLoggedOutFromPreviouslyCreatedAccount() {
        let(signOutBttn()).click();
    }


    @And("^The user is logging in his account via his personal data$")
    public void theUserIsLoggingInHisAccountViaHisPersonalData() {
        LoginIntoAccount.loginUser(accountName, ACCOUNT_PSSWD);
    }

    @Then("^The user has access to his account again$")
    public void theUserHasAccessToHisAccountAgain() {
        assertEquals(let(userHeader()).getText(), "Jan Kowalski");
    }
}
