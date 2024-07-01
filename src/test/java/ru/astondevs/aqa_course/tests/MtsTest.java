package ru.astondevs.aqa_course.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtsTest extends BaseTest {

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : услуги связи")
    public void checkTextInFieldCommunicationServicesTest() {
        WebElement phoneField = driver.findElement(By.id(PHONE_NUMBER_FIELD));
        phoneField.click();
        phoneField.sendKeys("1");

        WebElement sumField = driver.findElement(By.id(SUM_NUMBER_FIELD));
        sumField.click();
        sumField.sendKeys("2");
        sumField.submit();

        WebElement checkText = driver.findElement(By.xpath("//p[contains(text(), 'Номер телефона указан неверно')]"));

        assertEquals("Номер телефона указан неверно", checkText.getText());
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : домашний интернет")
    public void checkTextInFieldHomeInternetTest() {
        WebElement dropdownButton = driver.findElement(By.xpath(DROPDOWN_BUTTON));
        dropdownButton.click();

        List<WebElement> listItems = driver.findElements(By.xpath(LIST_TO_SELECT));
        WebElement homeInternet = listItems.get(1);
        homeInternet.click();

        WebElement internetPhone = driver.findElement(By.id("internet-phone"));
        internetPhone.sendKeys("1");
        internetPhone.submit();

        WebElement checkText = driver.findElement(By.xpath("//p[contains(text(), 'Необходимо указать номер в формате +375 00 ХХХ-ХХ-ХХ')]"));
        assertEquals("Необходимо указать номер в формате +375 00 ХХХ-ХХ-ХХ", checkText.getText());
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : рассрочка")
    public void checkTextInFieldInstallmentPaymentTest() {
        WebElement dropdownButton = driver.findElement(By.xpath(DROPDOWN_BUTTON));
        dropdownButton.click();

        List<WebElement> listItems = driver.findElements(By.xpath(LIST_TO_SELECT));
        WebElement installmentPayment = listItems.get(2);
        installmentPayment.click();

        WebElement accountNumber = driver.findElement(By.id("score-instalment"));
        accountNumber.sendKeys("1");
        WebElement sumInput = driver.findElement(By.id("instalment-sum"));
        sumInput.sendKeys("1");
        sumInput.submit();

        WebElement checkText = driver.findElement(By.xpath("//p[contains(text(), 'Введите корректный номер лицевого счета')]"));
        assertEquals("Введите корректный номер лицевого счета", checkText.getText());
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : задолженность")
    public void checkTextInFieldDeptTest() {
        WebElement dropdownButton = driver.findElement(By.xpath(DROPDOWN_BUTTON));
        dropdownButton.click();

        List<WebElement> listItems = driver.findElements(By.xpath(LIST_TO_SELECT));
        WebElement dept = listItems.get(3);
        dept.click();

        WebElement accountNumber = driver.findElement(By.id("score-arrears"));
        accountNumber.sendKeys("1");
        WebElement sumInput = driver.findElement(By.id("arrears-sum"));
        sumInput.sendKeys("1");
        sumInput.submit();

        WebElement checkText = driver.findElement(By.xpath("//p[contains(text(), 'Введите корректный номер лицевого счета')]"));
        System.out.println(checkText.getText());
        assertEquals("Введите корректный номер лицевого счета", checkText.getText());
    }
}