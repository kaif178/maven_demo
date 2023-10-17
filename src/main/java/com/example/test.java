package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32/chromedriver");

        // Create a new instance of the Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Perform actions, assertions, and other test steps here

        // Close the browser when done
        driver.quit();
    }