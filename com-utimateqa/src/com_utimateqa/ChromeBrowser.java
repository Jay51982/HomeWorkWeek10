package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // create driver object
        driver.get(baseUrl); // lunch the url

        driver.manage().window().maximize();  // to maximize browser window

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Current page title : " + driver.getTitle()); // print current page title

        System.out.println("Current URL : " + driver.getCurrentUrl());  //  print current page url

        System.out.println("Current page source :" + driver.getPageSource()); // print current page source

        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("admin123");

        driver.close();
    }
}
