package org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects;

import com.codeborne.selenide.ElementsCollection;
import org.it_academy.selenium_study.framework.pageobjects.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class ProductPage extends BasePage {
    private final By PRODUCT_TODO = By.xpath("//ul[@class=\"b-offers-subnav\"]//li[contains(@class, 'item')]//span");

    public ElementsCollection addElementsForCheck() {
        return $$(PRODUCT_TODO);
    }
}
