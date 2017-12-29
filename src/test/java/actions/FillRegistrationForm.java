package actions;

import pageObjects.Shorts;

import static pageObjects.RegistrationForms.*;

public class FillRegistrationForm extends Shorts {

    public static void fillPersonalInformation(boolean Mr, boolean singNewsletter, boolean signSpecialOffers,
                                               String firstName, String lastName, String psswd, String birthDay,
                                               String birthMonth, String birthYear) {
        if (Mr) {
            let(titleMrRadioBttn()).click();
        } else {
            let(titleMrsRadioBttn()).click();
        }

        let(firstNameForm()).sendKeys(firstName);
        let(lastNameForm()).sendKeys(lastName);
        let(psswrdForm()).sendKeys(psswd);
        let(dateOfBirthDay()).sendKeys(String.valueOf(birthDay));
        let(dateOfBirthMonth()).sendKeys(birthMonth);
        let(dateOfBirthYear()).sendKeys(String.valueOf(birthYear));

        if (singNewsletter) {
            let(singUpNewsletter()).click();
        }

        if (signSpecialOffers) {
            let(receiveOfferts()).click();
        }
    }

    public static void fillAddress(String companyName, String customersAddress, String customersAddressSecLine,
                                   String customersCity, String customersState, String customersZipPost,
                                   String customersCountry, String additionalInfo, String homePhone, String mobilePhone,
                                   String futureReference) {

        let(companyName()).sendKeys(companyName);
        let(customersAddress()).sendKeys(customersAddress);
        let(customersAddressSecLine()).sendKeys(customersAddressSecLine);
        let(customersCity()).sendKeys(customersCity);
        let(customersState()).sendKeys(customersState);
        let(customersZipPost()).sendKeys(customersZipPost);
        let(customersCountry()).sendKeys(customersCountry);
        let(additionalInfo()).sendKeys(additionalInfo);
        let(homePhone()).sendKeys(String.valueOf(homePhone));
        let(mobilePhone()).sendKeys(String.valueOf(mobilePhone));
        let(futureReference()).clear();
        let(futureReference()).sendKeys(futureReference);
    }
}

