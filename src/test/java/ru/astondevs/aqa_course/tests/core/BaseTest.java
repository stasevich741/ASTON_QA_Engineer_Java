package ru.astondevs.aqa_course.tests.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

abstract public class BaseTest {
   protected WebDriver driver;

    protected static final String BASE_URL = "https://www.mts.by";
    protected static final String PHONE_NUMBER_FIELD = "connection-phone";
    protected static final String SUM_NUMBER_FIELD = "connection-sum";
    protected static final String DROPDOWN_BUTTON = "//button[contains(@class, 'select__header')]";
    protected static final String LIST_TO_SELECT = "//li[contains(@class, 'select__item')]";
    protected static final String PHONE_NUMBER = "297777777";
    protected static final String IFRAME_PAYMENT = "//iframe[@class='bepaid-iframe']";
    protected static final String BUTTON_DEPOSIT_XPATH = "//button[@type='submit' and @class='colored disabled' and (contains(text(), 'Оплатить') and contains(text(), 'BYN'))]";

/**
 * не знал как лучше сделать, ожидаемые результаты для сравнений делать константами
 * или инициализировать их в самом тесте, поэтому сделал 2 варианта.
 */
    protected static final String EXPECTED_PHONE_NUMBER = "Номер телефона";
    protected static final String EXPECTED_SUM = "Сумма";
    protected static final String EXPECTED_EMAIL_PAYCHECK = "E-mail для отправки чека";
    protected static final String EXPECTED_USER_NUMBER = "Номер абонента";
    protected static final String EXPECTED_ACCOUNT_NUMBER = "Номер счета на 44";
    protected static final String EXPECTED_DEBT_NUMBER = "Номер счета на 2073";


    @BeforeEach
    protected void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        openMainPage();
    }

    protected void openMainPage() {
        driver.get(BASE_URL);
        WebElement cookieAgreeButton = driver.findElement(By.id("cookie-agree"));
        cookieAgreeButton.click();
    }

    @AfterEach
    protected void quit() {
        driver.quit();
    }
}
