package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.util.concurrent.TimeUnit;



public class BrowserManager extends Util {

    Loadprop loadprop = new Loadprop();

        public void setBrowser () {

            String browserName =loadprop.getProperty("BrowserName");

            //Check if parameter passed from TestNG is 'firefox'
            if(browserName.equalsIgnoreCase("firefox"))
            {
                //create firefox instance
                System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
                driver = new FirefoxDriver();
            }   // check if parameter passed is internal explorer
            else if(browserName.equalsIgnoreCase("I.E")){
                // create i.e  instatnce
                System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDrivers\\IEDriverServer.exe");
                 driver = new InternetExplorerDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



           }
            //Check if parameter passed as 'chrome'
            else if(browserName.equalsIgnoreCase("chrome"))
            {
                //creat webdriver instance;

                System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();

                options.setExperimentalOption("useAutomationExtension", false);
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                driver = new ChromeDriver(options);
            }else{
                //If no browser passed throw exception
                //throw new Exception("Browser is not correct");
                System.out.println("Browser is not correct");
            }






           // System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
             //driver =new ChromeDriver();

           driver.manage().window().maximize();  // window maximise;
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicity wait
            driver.get("https://demo.nopcommerce.com/"); //url
        }


        public void CloseBrowser() {
            driver.close();
        }


    }


