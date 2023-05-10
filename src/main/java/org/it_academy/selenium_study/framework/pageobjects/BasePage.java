package org.it_academy.selenium_study.framework.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public static boolean isElementVisible(By locator) {
        return $(locator).is(Condition.visible);
    }

}
