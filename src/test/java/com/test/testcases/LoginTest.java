package com.test.testcases;

import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.target.Base;
import com.test.util.Log;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends Base {

    @Test(dataProvider = "logindata")
    public void loginTest(String user, String pass) throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = hp.goToSignIn();
        lp.doLogin(user,pass);
      //  lp.doLogin(readConfig.getUserEmail(), readConfig.getPassword());
      //  Log.info(readConfig.getUserEmail() + readConfig.getPassword());
      //  Log.info("login successful");
        Log.info(user+" "+pass);
    }





    @DataProvider(name="logindata")
    public Object[][] getdata(){

        String [][] loginData= {
                { "rhasan@yahoo.com","Abc!234"},
                {"test@gmail","Xyz!23456"},
                { "ExpertAuto@hotmail.com","pqr!234"}
        };
        return loginData;

    }






        /*
        data-driven Test (ddt):

        @DataProvider
        construct a method for getting data
        invoke those data into actual tests

         */













        //Assertions
        //total 2 types of Assertions.
        //1. Hard Assertions = if fails , no further steps/code will execute
        //2. Soft Assertions = if fails, further steps/code will execute

       // SoftAssert softAssert= new SoftAssert();
        //softAssert.assertEquals(driver.getTitle(),"Facebook");

        //Hard Assert
      //  Assert.assertEquals(driver.getTitle(),"Facebook","test failed");










}

/*
Log4j -

- logging framework
- used for traceback the errors
- used instead of system.out.println()
- to debug the code


three components of log4j
- Loggers : responsible for capturing log records and passing them to corresponding appenders.

- Appenders : responsible for recording the log events to a destination file.

- Layouts : responsible for determining how the data should look like


There are 5 Log levels - defines the severity of something that fails
 - FATAL
 - ERROR
 - WARN
 - INFO
 - DEBUG


 */