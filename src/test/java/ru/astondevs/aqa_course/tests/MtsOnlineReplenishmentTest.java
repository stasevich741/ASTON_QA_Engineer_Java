package ru.astondevs.aqa_course.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.astondevs.aqa_course.tests.core.BaseTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtsOnlineReplenishmentTest extends BaseTest {

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : услуги связи")
    public void checkTextInFieldCommunicationServicesTest() {
        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        WebElement emailPaycheckCField = driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']"));

        assertAll(
                () -> assertEquals(EXPECTED_PHONE_NUMBER, phoneNumberField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_SUM, sumField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_EMAIL_PAYCHECK, emailPaycheckCField.getAttribute("placeholder"))
        );

    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : домашний интернет")
    public void checkTextInFieldHomeInternetTest() {
        List<WebElement> listItems = openDropdownList();
        WebElement homeInternet = listItems.get(1);
        homeInternet.click();

        WebElement userNumberField = driver.findElement(By.xpath("//input[@placeholder='Номер абонента']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        WebElement emailPaycheckCField = driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']"));

        assertAll(
                () -> assertEquals(EXPECTED_USER_NUMBER, userNumberField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_SUM, sumField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_EMAIL_PAYCHECK, emailPaycheckCField.getAttribute("placeholder"))
        );
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : рассрочка")
    public void checkTextInFieldInstallmentPaymentTest() {
        List<WebElement> listItems = openDropdownList();

        WebElement installmentPayment = listItems.get(2);
        installmentPayment.click();

        WebElement accountNumberField = driver.findElement(By.xpath("//input[@placeholder='Номер счета на 44']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        WebElement emailPaycheckCField = driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']"));

        assertAll(
                () -> assertEquals(EXPECTED_ACCOUNT_NUMBER, accountNumberField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_SUM, sumField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_EMAIL_PAYCHECK, emailPaycheckCField.getAttribute("placeholder"))
        );
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях : задолженность")
    public void checkTextInFieldDebtTest() {
        List<WebElement> listItems = openDropdownList();
        WebElement dept = listItems.get(3);
        dept.click();

        WebElement debtAccountNumberField = driver.findElement(By.xpath("//input[@placeholder='Номер счета на 2073']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        WebElement emailPaycheckCField = driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']"));

        assertAll(
                () -> assertEquals(EXPECTED_DEBT_NUMBER, debtAccountNumberField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_SUM, sumField.getAttribute("placeholder")),
                () -> assertEquals(EXPECTED_EMAIL_PAYCHECK, emailPaycheckCField.getAttribute("placeholder"))
        );
    }

    private List<WebElement> openDropdownList() {
        WebElement dropdownButton = driver.findElement(By.xpath(DROPDOWN_BUTTON));
        dropdownButton.click();

        return driver.findElements(By.xpath(LIST_TO_SELECT));
    }
}