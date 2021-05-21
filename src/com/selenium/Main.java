package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	//chrome browser------>chromedriver
    //      //1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers//drivers//chrome driver/chromedriver.exe");
        WebDriver driver1=new ChromeDriver();

    //     //2. NAVIGATE TO THE URL
        driver1.get("https://www.google.com");
    //    driver1.get("http://automationpractice.com/index.php");

        //[By ID]
     //   driver1.findElement(By.id("search_query_top")).sendKeys("T-shirts");

        driver1.manage().window().maximize();

        //[By name]
    //    driver1.findElement(By.name("search_query")).sendKeys("Shirts");

        //[By LinkText]
        //   driver1.findElement(By.id("search_query_top")).sendKeys("T-shirts");
    //    driver1.findElement(By.linkText("Printed Chiffon Dress")).click();

        //[By Partial LinkText]
    //    driver1.findElement(By.partialLinkText("Chiffon Dress")).click();

        //By TagName
        List<WebElement> link=driver1.findElements(By.tagName("a"));
        System.out.println(link.size());

    //Name of the links
        for (WebElement l : link)
        {
            System.out.println(l.getText());

        }



        //3. CLOSE THE BROWSER
    //    driver1.close();

        //1. OPEN THE FIREFOX BROWSER
    //        System.setProperty("webdriver.gecko.driver", "C://selenium jars and drivers//drivers//firefox driver/geckodriver.exe");
    //        WebDriver driver=new FirefoxDriver();

        //2. NAVIGATE TO THE URL
        //    driver.get("https://www.google.com");

        //3. CLOSE THE BROWSER
        //    driver.close();
    }
}
