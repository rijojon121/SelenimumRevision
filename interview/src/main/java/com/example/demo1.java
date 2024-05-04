package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

    public static void main(String[] args) {
        

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();

        //by name 

        driver.findElement(By.name("search")).sendKeys("Mac");

        //by id

        boolean logoDisplayedStatus =   driver.findElement(By.id("logo")).isDisplayed();

        System.out.println(logoDisplayedStatus);

        //link text and partial link test 

       // driver.findElement(By.linkText("Tablets")).click();
       // driver.findElement(By.partialLinkText("blets")).click();

       // to locate group of elements by class name 

        // List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));

        // System.out.println("Total number of links "+headerLinks.size());

        // to locate group of elements by using tag name  

        // List<WebElement> links= driver.findElements(By.tagName("a"));
        // System.out.println(links.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images" + images.size());



















         










        driver.close();
    }



}
