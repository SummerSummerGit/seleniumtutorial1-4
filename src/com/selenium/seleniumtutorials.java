package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorials {
        public static void main(String[] args) {
                //1. OPEN THE CHROME BROWSER
                System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers//drivers//chrome driver/chromedriver.exe");
                WebDriver driver1 = new ChromeDriver();

                //Maximize the chrome browser
           //   driver1.get("https://www.google.com");
                driver1.manage().window().maximize();

                //     //2. NAVIGATE TO THE URL
         //       driver1.get("http://automationpractice.com/index.php");

                //[By ID]
           //     driver1.findElement(By.id("search_query_top")).sendKeys("T-shirts");
                //OR
              //    WebElement search=driver1.findElement(By.id("search_query_top"));
             //     search.sendKeys("T-shirts");

            //[By name]
        //    driver1.findElement(By.name("search_query")).sendKeys("Shirts");


        }
}