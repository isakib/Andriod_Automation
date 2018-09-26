package com.google.android.keep.tests;

import com.google.android.keep.Pages.LoginPage;
import com.google.android.keep.Utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class LoginTest {

    AppiumDriver   driver;

    LoginPage loginPage;


    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app = new AppInitializer();
        driver = app.getAndroidDriver();

        loginPage = new LoginPage(driver);
    }

    @Test
    public void LoginTest() throws MalformedURLException, InterruptedException{

        loginPage.LoginToSystem(driver);

    }

    @After
     public void tearDown(){

        driver.quit();

     }
}
