package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // c
        driver.get(baseUrl);  // lunch url
        driver.manage().window().maximize();  // to maximize opend window

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // add waiting time

        System.out.println("Tile of current page : " + driver.getTitle());  // print current page title

        System.out.println("Current page URL : "+driver.getCurrentUrl() );  // print current page url

        System.out.println("Current page source : "+ driver.getPageSource());  // print page source of current page

        //find email input box in browser from locator element
        WebElement emailField = driver.findElement(By.name("Email"));
        emailField.sendKeys("abc@xyz.com");

        //find the password field in browser from locator element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("xyz");
    }

}
