package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

    public static void main(String[] args) {
        

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.findElement(By.name("search")).sendKeys("Mac");

        boolean logoDisplayedStatus =   driver.findElement(By.id("logo")).isDisplayed();

        System.out.println(logoDisplayedStatus);

        driver.close();
    }



}
