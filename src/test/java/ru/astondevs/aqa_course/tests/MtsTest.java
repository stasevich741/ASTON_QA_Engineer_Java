package ru.astondevs.aqa_course.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest extends BaseTest {

    @Test
    @DisplayName("проверка блока «Онлайн пополнение без комиссии»:")
    public void checkElementNameTest() {
        WebElement payWrapperElement = driver.findElement(By.xpath("//section[@class = 'pay']//h2"));
        assertEquals("Онлайн пополнение" + "\n" + "без комиссии", payWrapperElement.getText());
    }

    @Test
    @DisplayName("Проверить наличие логотипов платёжных систем")
    public void checkLogo() {
        List<WebElement> logoElements = driver.findElements(By.className("pay__partners"));
        for (WebElement logo : logoElements) {
            assertTrue(logo.isDisplayed());
        }
    }

    @Test
    @DisplayName("Проверить работу ссылки «Подробнее о сервисе»")
    public void checkLink() {
        WebElement serviceLink = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        serviceLink.click();

        String href = serviceLink.getAttribute("href");
        assertEquals(MORE_ABOUT_SERVICE_URL, href);
    }

    @Test
    @DisplayName("Заполнить поля и проверить работу кнопки «Продолжить»")
    public void communicationServices() {
        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        phoneField.click();
        phoneField.sendKeys(PHONE_NUMBER);

        WebElement sumField = driver.findElement(By.id("connection-sum"));
        sumField.click();
        sumField.sendKeys("1");
        sumField.submit();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement paymentWindow = driver.findElement(By.xpath("//div[@class='card-page__card']"));
        assertTrue(paymentWindow.isDisplayed());
    }
}
