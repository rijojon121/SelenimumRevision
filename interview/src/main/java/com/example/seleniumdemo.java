
package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

       String actualString = driver.getTitle();

       if(actualString.equals("Your Store"))
       {
        System.out.println("Test is Passed");
    } else {
           System.out.println("Test is Failed");

       }
        
        driver.close();

        



       // driver.quit();

        
    }
}
