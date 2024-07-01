package ru.astondevs.aqa_course.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.astondevs.aqa_course.tests.core.BaseTest;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MtsCommunicationServicesTest extends BaseTest {

    @Test
    @DisplayName("Проверить корректность отображения суммы в окне (в том числе на кнопке)")
    public void checkSumIsCorrectTest() {
        switchToPaymentIframe();

        WebElement depositAmount = driver.findElement(By.xpath("//span[text() = '2.00 BYN']"));
        WebElement buttonDepositAmount = driver.findElement(By.xpath(BUTTON_DEPOSIT_XPATH));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(buttonDepositAmount));

        assertAll(
                () -> assertEquals("2.00 BYN", depositAmount.getText()),
                () -> assertEquals("Оплатить 2.00 BYN", buttonDepositAmount.getText()));
    }

    @Test
    @DisplayName("Проверить корректность отображения номера телефона")
    public void checkPhoneNumberIsCorrectTest() {
        switchToPaymentIframe();

        WebElement paymentInfo = driver.findElement(By.xpath("//div[@class='pay-description__text']/span"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(paymentInfo));

        String expected = "Оплата: Услуги связи Номер:375297777777";
        assertEquals(expected, paymentInfo.getText());
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях для ввода реквизитов карты")
    public void checkTextInBlankFieldsCardTest() {
        switchToPaymentIframe();

        WebElement cardNumberField = driver.findElement(By.xpath("//label[text()='Номер карты']"));
        WebElement durationPeriodField = driver.findElement(By.xpath("//label[text()='Срок действия']"));
        WebElement holderNameField = driver.findElement(By.xpath("//label[text()='Имя держателя (как на карте)']"));
        WebElement CVCField = driver.findElement(By.xpath("//label[text()='CVC']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(cardNumberField));

        String expectedCardNumberField = "Номер карты";
        String expectedDurationPeriodField = "Срок действия";
        String expectedHolderNameField = "Имя держателя (как на карте)";
        String expectedCVCField = "CVC";

        assertAll(
                () -> assertEquals(expectedCardNumberField, cardNumberField.getText()),
                () -> assertEquals(expectedDurationPeriodField, durationPeriodField.getText()),
                () -> assertEquals(expectedHolderNameField, holderNameField.getText()),
                () -> assertEquals(expectedCVCField, CVCField.getText()));
    }

    @Test
    @DisplayName("Проверить наличие иконок платёжных систем")
    public void checkPaymentSystemIconsTest() {
        switchToPaymentIframe();

        WebElement header = driver.findElement(By.xpath("//div[@class='header__container']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(header));

        List<WebElement> logoElements = driver.findElements(By.xpath("//div[@class='icons-container ng-tns-c46-1']"));
        for (WebElement logo : logoElements) {
            assertTrue(logo.isDisplayed());
        }
    }

    private void switchToPaymentIframe() {
        WebElement phoneField = driver.findElement(By.id(PHONE_NUMBER_FIELD));
        phoneField.click();
        phoneField.sendKeys(PHONE_NUMBER);

        WebElement sumField = driver.findElement(By.id(SUM_NUMBER_FIELD));
        sumField.click();
        sumField.sendKeys("2");
        sumField.submit();

        WebElement iframe = driver.findElement(By.xpath(IFRAME_PAYMENT));
        driver.switchTo().frame(iframe);
    }
}
