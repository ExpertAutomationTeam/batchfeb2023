package com.test.testcases;

import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.target.Base;
import com.test.util.ExcelReader;
import com.test.util.Log;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDrivenTest extends Base {
/*
    @Test(dataProvider = "ddt")
    public void ddt(String user, String pass) throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = hp.goToSignIn();
        lp.doLoginFB(user,pass);
        Log.info(user+" "+pass);

    }

 */

    @Test(dataProvider = "ddt")
    public void ddt(String user, String pass) throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.doLoginFB(user,pass);
        Log.info(user+" "+pass);

    }




    @DataProvider(name="ddt")
    public Object[][] getddt() throws IOException {
        String path="./src/test/resources/excel/loginDDT.xlsx";
       int rowNum=ExcelReader.getRowCount(path,"Sheet1");
       int colcount=ExcelReader.getColCount(path, "Sheet1",1);

       String logindata [][]= new String[rowNum][colcount];

       for (int i=1; i<=rowNum; i++){
            for (int j=0;j<colcount;j++){
                logindata[i-1][j]  =ExcelReader.getCellData(path,"Sheet1", i, j);
            }
       }
       return logindata;



    }

}
