package org.gradle;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass
{
   WebDriver driver = null;
   
   @BeforeTest
   public void launchapp()
   {
	   File file = new File("src/test/resources/chromedriver.exe");
	   System.out.println("Nikhillllllllllllllllll" + file.getAbsolutePath());
	   System.setProperty("webdriver.ie.driver", "C:\\Users\\Nikhil\\workspace\\test-automation\\src\\test\\resources\\IEDriverServer.exe");
	   //driver = new ChromeDriver();
      /// Puts an Implicit wait, Will wait for 10 seconds before throwing exception

   }
   @Test
   public void calculatepercent()
   {        // declaration and instantiation of objects/variables
       WebDriver driver = new InternetExplorerDriver();
       String baseUrl = "http://newtours.demoaut.com";
       String expectedTitle = "Welcome: Mercury Tours";
       String actualTitle = "";

       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // Launch website
      // driver.navigate().to("http://www.calculator.net");
       driver.manage().window().maximize();
       // launch Firefox and direct it to the Base URL
       driver.get(baseUrl);

       // get the actual value of the title
       actualTitle = driver.getTitle();

       /*
        * compare the actual title of the page witht the expected one and print
        * the result as "Passed" or "Failed"
        */
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed");
       }
      
       //close Firefox
       driver.close();
      
       // exit the program explicitly
       }

}