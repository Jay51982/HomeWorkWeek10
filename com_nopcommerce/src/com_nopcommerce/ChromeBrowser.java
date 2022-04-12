package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args){
    String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); //
    WebDriver driver = new ChromeDriver(); // set upt driver
        driver.get(baseUrl);  // lunching the URL
        driver.manage().window().maximize(); //  to maximize the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((20))); // add waiting time

        String title = driver.getTitle(); //to print page title - store value in string variable
        System.out.println(title);  // print title of page

        // to get current page URL
        System.out.println("Current URL : "+ driver.getCurrentUrl());

        // to print page source
        System.out.println("Current page source : "+driver.getPageSource());

        //  find email title element
        WebElement emailField = driver.findElement(By.id("Email"));
        //sendin email to email field element
        emailField.sendKeys("abc@xyz.com");

        //find the email field element
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("abcxyz");

       driver.close();
    }
}
