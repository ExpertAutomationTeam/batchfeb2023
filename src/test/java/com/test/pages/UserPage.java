package com.test.pages;

import com.test.target.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends Base {

    public UserPage (WebDriver ldriver){
        driver=ldriver;
        PageFactory.initElements(ldriver, this);
    }
}
