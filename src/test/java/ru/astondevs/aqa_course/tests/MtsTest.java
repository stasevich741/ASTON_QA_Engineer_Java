package ru.astondevs.aqa_course.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    public void checkLogoTest() {
        List<WebElement> logoElements = driver.findElements(By.className("pay__partners"));
        for (WebElement logo : logoElements) {
            assertTrue(logo.isDisplayed());
        }
    }

    @Test
    @DisplayName("Проверить работу ссылки «Подробнее о сервисе»")
    public void checkServiceLinkTest() {
        WebElement serviceLink = driver.findElement(By.xpath("//a[text() = 'Подробнее о сервисе']"));
        serviceLink.click();

        assertEquals(MORE_ABOUT_SERVICE_URL, driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Заполнить поля и проверить работу кнопки «Продолжить»")
    public void communicationServicesTest() {
        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        phoneField.click();
        phoneField.sendKeys(PHONE_NUMBER);

        WebElement sumField = driver.findElement(By.id("connection-sum"));
        sumField.click();
        sumField.sendKeys("2");
        sumField.submit();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        assertTrue(iframe.isEnabled());
    }
}