package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumtutorials4 {

    public static void main(String[] args) {
        //chrome browser------>chromedriver
        //      //1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers//drivers//chrome driver/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();

        //max the chrome browser
        driver1.manage().window().maximize();


        //     //2. NAVIGATE TO THE URL
            driver1.get("https://www.google.com");
        // driver1.get("http://automationpractice.com/index.php");
      //  driver1.get("http://automationpractice.com/index.php?id_category=8&controller=category");

        //By TagName
        List<WebElement> link=driver1.findElements(By.tagName("a"));
        System.out.println(link.size());//I received 19

      //Name of the links
      for (WebElement l : link)
      {
          System.out.println(l.getText());

       }


    }
}
