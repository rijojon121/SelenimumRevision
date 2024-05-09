package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectordemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        //by tag and id ------ tag#id 
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
      //  driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");

        //by tage and class ------ tag.classname

       // driver.findElement(By.cssSelector("input.search-box-text")).click();
      //  driver.findElement(By.cssSelector(".search-box-text"));

        // tag and attribute tag[attribute="Value"]

        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("mac");

        //Tag class and attribute 

        driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");
        






        Thread.sleep(3000);
        driver.close();


    }
}
