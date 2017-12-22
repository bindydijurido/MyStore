package pageObjects;

import org.openqa.selenium.By;
import utility.Root;


public class RegistrationForms extends Root {

    public static By emailAddressField() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input");
    }

    public static By titleMrRadioBttn() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input");
    }

    public static By titleMrsRadioBttn() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input");
    }

    public static By firstNameForm() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input");
    }

    public static By lastNameForm() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input");
    }

    public static By emailForm() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[4]/input");
    }

    public static By psswrdForm() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input");
    }

    public static By dateOfBirthDay() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select");
    }

    public static By dateOfBirthMonth() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select");
    }

    public static By dateOfBirthYear() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select");
    }

    public static By singUpNewsletter() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[7]/div/span/input");
    }

    public static By receiveOfferts() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[8]/div/span/input");
    }

    public static By firstName() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[1]/input");
    }

    public static By lastName() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[2]/input");
    }

    public static By companyName() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[3]/input");
    }

    public static By customersAddress() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input");
    }

    public static By customersAddressSecLine() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[5]/input");
    }

    public static By customersCity() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input");
    }

    public static By customersState() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select");
    }

    public static By customersZipPost() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input");
    }

    public static By customersCountry() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[9]/div/select");
    }

    public static By additionalInfo() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[9]/div/select");
    }

    public static By homePhone() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[12]/input");
    }

    public static By mobilePhone() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input");
    }

    public static By futureReference() {
        return By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[14]/input");
    }
}

