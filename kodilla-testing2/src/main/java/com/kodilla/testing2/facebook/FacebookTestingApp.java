package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String SELECT_DAY = "//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String SELECT_MONTH = "//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]";
    public static final String SELECT_YEAR = "//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[@data-cookiebanner=\"accept_button\"]"));
        acceptCookiesButton.click();

        WebElement createAccountButton = driver.findElement(By.xpath("//a[contains(@data-testid, \"open-registration-form-button\")]"));
        createAccountButton.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement firstNameField = driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
        firstNameField.click();
        firstNameField.sendKeys("John");

        WebElement lastNameField = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastNameField.sendKeys("Doe");

        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
        phoneNumberField.sendKeys("1234567890");

        WebElement selectCombo = driver.findElement(By.xpath(SELECT_DAY));
        Select selectDay = new Select(selectCombo);

        WebElement selectCombo1 = driver.findElement(By.xpath(SELECT_MONTH));
        Select selectMonth = new Select(selectCombo1);

        WebElement selectCombo2 = driver.findElement(By.xpath(SELECT_YEAR));
        Select selectYear = new Select(selectCombo2);

        selectDay.selectByIndex(0);
        selectMonth.selectByIndex(0);
        selectYear.selectByIndex(22);
    }
}
