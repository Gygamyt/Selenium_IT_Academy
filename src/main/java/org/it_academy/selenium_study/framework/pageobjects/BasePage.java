package org.it_academy.selenium_study.framework.pageobjects;

import com.codeborne.selenide.Condition;
import org.it_academy.selenium_study.framework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage {
//    private final WebDriver driver;
//
//    public BasePage() {
//        driver = Driver.initDriver();
//    }
//
//    public WebElement waitForElementVisible(By by) {
//        Wait<WebDriver> wait = new WebDriverWait(driver, ofSeconds(30));
//        return wait.until(visibilityOfElementLocated(by));
//    }
//
//    public boolean isElementDisplayed(By locator) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, ofSeconds(10));
//            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//            return element.isDisplayed();
//        } catch (Exception e) {
//            System.out.println("!isDisplayed");
//            return false;
//        }
//    }

    public static boolean isElementVisible(By locator) {
        return $(locator).is(Condition.visible);
    }

}
