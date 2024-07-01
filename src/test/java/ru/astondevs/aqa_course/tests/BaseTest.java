package ru.astondevs.aqa_course.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

abstract public class BaseTest {
   protected WebDriver driver;

    public static final String BASE_URL = "https://www.mts.by";
    public static final String PHONE_NUMBER_FIELD = "connection-phone";
    public static final String SUM_NUMBER_FIELD = "connection-sum";
    public static final String DROPDOWN_BUTTON = "//button[contains(@class, 'select__header')]";
    public static final String LIST_TO_SELECT = "//li[contains(@class, 'select__item')]";

    @BeforeEach
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        openMainPage();
    }

    protected void openMainPage() {
        driver.get(BASE_URL);
        WebElement cookieAgreeButton = driver.findElement(By.id("cookie-agree"));
        cookieAgreeButton.click();
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }
}
