package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class demotest {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");

        driver.manage().window().maximize();

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("total number of links is: "+ links.size());

        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("total number of images is: "+ images.size());

     ((WebElement) driver.findElements(By.linkText("The Nokia Lumia 1520 is powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor and it comes with 2GB of RAM."))).click();
      // driver.findElement(By.linkText("Tablets")).click();

      Thread.sleep(3000);


        driver.close();
    }
}
