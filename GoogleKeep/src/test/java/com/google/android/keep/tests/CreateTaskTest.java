package com.google.android.keep.tests;

import com.google.android.keep.Pages.CreateNotesPage;
import com.google.android.keep.Utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class CreateTaskTest {

    AppiumDriver driver;

    CreateNotesPage createnotes;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app = new AppInitializer();
        driver = app.getAndroidDriver();

        createnotes = new CreateNotesPage(driver);
    }

    @Test
    public void CreateTaskTwo() throws MalformedURLException, InterruptedException{

        createnotes.CreateNoteVerify(driver);

    }

    @After
     public void tearDown(){

        driver.quit();

     }
}
