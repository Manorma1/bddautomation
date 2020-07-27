package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegisterSuccessPage extends Util {
    private By _regesterpage = By.xpath("//div[@class='result']");
    String expectedText = "Your registration completed";




    public  void userIsOnRegesterPage(){

// verify user is on register page;
        Assert.assertEquals(getTextFromElement(this._regesterpage), this.expectedText);




    }

















}
