package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseURl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // object ot edgedriver
        driver.get(baseURl);

        driver.manage().window().maximize();  // to maximize browser window

        System.out.println("Page title : "+driver.getTitle()); // to print page title

        System.out.println("Current URL : "+driver.getCurrentUrl()); //  print current page url
        System.out.println("Current page source : "+driver.getPageSource());  // print current page source

        //find email input from locator element
        WebElement emailField = driver.findElement(By.name("txtUsername"));
        emailField.sendKeys("Admin"); // input Admin in email box

        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123"); //

        driver.close();

    }
}
