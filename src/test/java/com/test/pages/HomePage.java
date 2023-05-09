package com.test.pages;

import com.test.target.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// in Page Object Model each page is represented by a single class
//we use PageFactory to initialize WebElelments
//use @FindBy for creating locators
public class HomePage extends Base {

    public HomePage (WebDriver ldriver){
        driver=ldriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//*[text()='Sign in']")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"listaccountNav-signIn\"]/a/span")
    WebElement signInatnavigation;

    @FindBy(xpath = "//*[text()='Create Account']")
    WebElement createAccount;


    public CreateAccountPage goToCreateAccountPage(){
        signIn.click();
        createAccount.click();
      return new CreateAccountPage(driver);

    }

    public LoginPage goToSignIn(){
        signIn.click();
        signInatnavigation.click();
     return new LoginPage(driver);

    }





}
