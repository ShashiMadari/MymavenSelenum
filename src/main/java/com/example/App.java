package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {
        // Set path to ChromeDriver (update this path if necessary for your Jenkins environment)
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Set ChromeOptions for headless mode and other settings
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--start-maximized");  // Maximize window at startup
        options.addArguments("--disable-gpu"); // Disable GPU (optional for headless)
        options.addArguments("--no-sandbox"); // Disable sandboxing (required for headless on some systems)

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

        // Open the SauceDemo site
        driver.get("https://www.saucedemo.com/");

        // Perform login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Optional: Add a wait or delay if needed
        try {
            Thread.sleep(5000); // Wait for 5 seconds before closing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

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
