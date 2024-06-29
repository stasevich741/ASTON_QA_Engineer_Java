package ru.astondevs.aqa_course.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseTest {
   protected WebDriver driver;

    public static final String BASE_URL = "https://www.mts.by";
    public static final String MORE_ABOUT_SERVICE_URL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
    public static final String PHONE_NUMBER = "297777777";


    @BeforeEach
    public void setDriver() {
        driver = new ChromeDriver();
        openMainPage();
    }

    public void openMainPage() {
        driver.get(BASE_URL);
        WebElement cookieAgreeButton = driver.findElement(By.id("cookie-agree"));
        cookieAgreeButton.click();
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }
}
