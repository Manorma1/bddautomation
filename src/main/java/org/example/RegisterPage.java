package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends Util {
    Loadprop loadprop = new Loadprop();


    private By _firstName =By.id("FirstName");
    private By _lastName = By.xpath("//input[@name=\"LastName\"]");
    private  By _dateOfBirthDay = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private  By _dateOfMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private  By _dateOfYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private  By _emailId =By.id("Email");
    private By _companyName = By .id("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickOnRegester = By.id("register-button");





    public void userEnterREgistrationDetails(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_firstName,loadprop.getProperty("FirstName")); // type first name;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_lastName,loadprop.getProperty("lastName"));  // type last name;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        selectFromDropDownByVisibleText(_dateOfBirthDay,loadprop.getProperty("DateOfBirthDay")); //type date of birth
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        selectFromDropDownByValue(_dateOfMonth,loadprop.getProperty("DateOfMonth")); //type month
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        selectFromDropDownByindex(_dateOfYear,loadprop.getProperty("BirthYear")); // type a year
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_emailId,loadprop.getProperty("EmailId")+timestamp()+loadprop.getProperty("Email")); //type email
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_companyName,loadprop.getProperty("CompanyName")); //typecompany name
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TypeText(_password,loadprop.getProperty("password")); //type password
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TypeText(_confirmPassword,loadprop.getProperty("confirmPassword")); // confirm password
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);






    }   // user click on register button
    public  void userClickOnRegester(){
        clickOnElement(_clickOnRegester,20);
    }












}
