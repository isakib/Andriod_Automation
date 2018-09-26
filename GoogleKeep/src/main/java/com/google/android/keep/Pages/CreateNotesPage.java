package com.google.android.keep.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class CreateNotesPage {

    public CreateNotesPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Notes you add appear here']")
//    public WebElement  text_empty_block;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Take a note…']")
//    public WebElement insert_notes;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.google.android.keep:id/editable_title']")
    public WebElement set_note_title;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Note']")
    public WebElement set_note_details;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
    public WebElement save_note_now;

    public void CreateNoteVerify(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(2000);
//        text_empty_block.isDisplayed();
//        driver.swipe(0,2624,768, 2792, 3000);
//        driver.tap(67, insert_notes, 3000);
        driver.tap(1, 182, 1983, 3000);
        sleep(1500);
        driver.tap(1, 100, 343, 3000);
//        insert_notes.click();
        set_note_title.sendKeys("hello naser from script");
        sleep(2000);
        set_note_details.sendKeys("New text from the the milk");
        sleep(2000);
        save_note_now.click();
        sleep(2000);
    }

}
