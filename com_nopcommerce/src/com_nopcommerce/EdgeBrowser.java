package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver(); // set up driver object
        driver.get(baseUrl);  // luanch the url in browser window

        driver.manage().window().maximize(); // to maximize browser window

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // waiting time added

        System.out.println("Page tile : " + driver.getTitle());  // to print page title

        System.out.println("Current URL : " + driver.getCurrentUrl());  // print current page url
        System.out.println("Current page source : " + driver.getPageSource());  // print current page source

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
