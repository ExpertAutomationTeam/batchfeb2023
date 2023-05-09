package com.test.pages;

import com.test.target.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage (WebDriver ldriver){
        driver=ldriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(id="email")
    WebElement emailFB;

    @FindBy(id="pass")
    WebElement passFB;

    @FindBy(id="username")
    WebElement emailOrPhone;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login")
    WebElement signInOrLogin;

    public UserPage doLogin(String uname, String pass) throws InterruptedException {
        emailOrPhone.sendKeys(uname);
        password.sendKeys(pass);
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        return new UserPage(driver);
      //  signInOrLogin.click();

    }

    public UserPage doLoginFB(String uname, String pass) throws InterruptedException {
        emailFB.sendKeys(uname);
        passFB.sendKeys(pass);
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        return new UserPage(driver);
        //  signInOrLogin.click();

    }


}
