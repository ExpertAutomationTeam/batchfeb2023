package com.test.target;

import com.test.util.Log;
import com.test.util.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Base {

public static WebDriver driver;
public static ReadConfig readConfig = new ReadConfig();


    @Parameters("browser")
    @BeforeClass
    public void setup(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
           // System.out.println("chromedriver launched");
            Log.info("chromedriver launched");
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
            System.out.println("FirefoxDriver launched");

        } else {
            driver=new EdgeDriver();
            System.out.println("EdgeDriver launched");
        }
        driver.manage().window().maximize();
        driver.get(readConfig.getTestSite());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //System.out.println("navigates to Target");
        Log.info("navigates to Target");


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        if (driver!=null){
            Thread.sleep(4000);
            driver.quit();
           // System.out.println("browser quits");
            Log.warn("browser quits");
        }
    }


}
