package com.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    FileInputStream fis;
    Properties properties= new Properties();

    public ReadConfig() {

        try {
            fis = new FileInputStream(new File("./src/test/resources/properties/config.properties"));
            properties.load(fis);
        } catch (Exception e) {
            Log.info(e.getMessage());
        }
    }


    public String getTestSite(){
        String testsite = properties.getProperty("testsite");
        return testsite;

    }

    public String getUserEmail(){
        String email = properties.getProperty("email");
        return email;

    }

    public String getFname(){
        String fname = properties.getProperty("fname");
        return fname;

    }

    public String getLname(){
        String lname = properties.getProperty("lname");
        return lname;

    }

    public String getphoneNo(){
        String phoneno = properties.getProperty("phoneno");
        return phoneno;

    }

    public String getPassword(){
        String pass = properties.getProperty("pass");
        return pass;

    }

}
