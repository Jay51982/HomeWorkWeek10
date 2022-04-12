package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

    public static void main(String[] args) {
        String baseURl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver(); // object ot edgedriver
        driver.get(baseURl);

        driver.manage().window().maximize();  // to maximize browser window

        System.out.println("Page title : "+driver.getTitle()); // to print page title

        System.out.println("Current URL : "+driver.getCurrentUrl()); //  print current page url
        System.out.println("Current page source : "+driver.getPageSource());  // print current page source

        //find email input from locator element
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("Admin"); // input Admin in email box

        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("admin123"); //

        driver.close();

    }
}
