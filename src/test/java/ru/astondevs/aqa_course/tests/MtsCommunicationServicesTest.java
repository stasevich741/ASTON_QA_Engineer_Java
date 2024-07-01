package ru.astondevs.aqa_course.tests;
/*
2. Для варианта «Услуги связи» заполнить поля в соответствии с пререквизитами из предыдущей темы,
 нажать кнопку «Продолжить» и в появившемся окне проверить корректность отображения суммы (в том числе на кнопке),
  номера телефона, а также надписей в незаполненных полях для ввода реквизитов карты, наличие иконок платёжных систем.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.astondevs.aqa_course.tests.core.BaseTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void checkPhoneNumberIsCorrect() {
        switchToPaymentIframe();

        WebElement paymentInfo = driver.findElement(By.xpath("//div[@class='pay-description__text']/span"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(paymentInfo));

        String expected = "Оплата: Услуги связи Номер:375297777777";
        assertEquals(expected,paymentInfo.getText());
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
