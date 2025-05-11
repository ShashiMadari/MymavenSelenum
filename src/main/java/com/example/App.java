package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/home/shruthi/Desktop/hromedriver-linux64");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the SauceDemo site
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Perform login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
