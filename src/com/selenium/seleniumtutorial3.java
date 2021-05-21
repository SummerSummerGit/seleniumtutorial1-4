package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial3 {

    public static void main(String[] args) {
        //chrome browser------>chromedriver
        //      //1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers//drivers//chrome driver/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();

        //max the chrome browser
        driver1.manage().window().maximize();


        //     //2. NAVIGATE TO THE URL
        //    driver1.get("https://www.google.com");
        // driver1.get("http://automationpractice.com/index.php");
    //    driver1.get("http://automationpractice.com/index.php?id_category=8&controller=category");


        //[By LinkText]
      //  driver1.findElement(By.linkText("Printed Chiffon Dress")).click();

        //[By Partial LinkText]
    //    driver1.findElement(By.partialLinkText("Chiffon Dress")).click();



    }
}
