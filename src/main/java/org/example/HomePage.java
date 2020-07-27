package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;






public class HomePage extends Util {







      private By _RegisterButton = By.linkText("Register");


   // user click  on register button;
        public void clickOnRegisterButton(){
            clickOnElement(_RegisterButton,40);
        }














}
