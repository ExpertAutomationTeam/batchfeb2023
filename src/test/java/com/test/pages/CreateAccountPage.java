package com.test.pages;

import com.test.target.Base;
import com.test.util.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Base {

    public CreateAccountPage (WebDriver ldriver){
        driver=ldriver;
        PageFactory.initElements(ldriver, this);
    }


    @FindBy(id="username")
    WebElement emailAddress;

    @FindBy(id="firstname")
    WebElement firstName;

    @FindBy(id="lastname")
    WebElement lastName;

    @FindBy(id="phone")
    WebElement phone;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="createAccount")
    WebElement createAccount;


    public LoginPage createAccount(String email, String fname, String lname, String phoneNo, String pass){
        emailAddress.sendKeys(email);
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        phone.sendKeys(phoneNo);
        password.sendKeys(pass);
      return new LoginPage(driver);
       // createAccount.click();

    }


}
