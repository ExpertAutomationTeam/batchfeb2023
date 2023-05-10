package com.test.testcases;

import com.test.pages.CreateAccountPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.pages.UserPage;
import com.test.target.Base;
import com.test.util.Log;
import org.testng.annotations.Test;

public class CreateAccountTest extends Base {

    @Test(priority = 3)
    public void createAccTest(){
        HomePage hp = new HomePage(driver);
        CreateAccountPage cap=hp.goToCreateAccountPage();
        LoginPage lp =cap.createAccount(readConfig.getUserEmail(), readConfig.getFname(), readConfig.getLname(), readConfig.getphoneNo(), readConfig.getPassword());
        Log.info(readConfig.getFname()+readConfig.getLname());
        Log.info("account created successfully");
    }

}
