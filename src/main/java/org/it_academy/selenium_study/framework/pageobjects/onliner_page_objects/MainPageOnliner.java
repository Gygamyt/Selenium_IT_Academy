package org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects;

import com.codeborne.selenide.ElementsCollection;
import org.it_academy.selenium_study.framework.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPageOnliner extends BasePage {
    private final By SEARCH_FIELD = By.xpath("//input[@class=\"fast-search__input\"]");

    private final By PRODUCT_NAME_XPATH = By.xpath("//div[@class=\"product__title\"]");

    private final String IFRAME_XPATH = "//iframe[@class=\"modal-iframe\"]";


    public MainPageOnliner search(String request) {
        $(SEARCH_FIELD).sendKeys(request);
        return this;
    }

    public boolean iFrameCheck() {
        return isElementVisible(By.xpath(IFRAME_XPATH));
    }

    public ProductPage clickOnProductLink() {
        $(PRODUCT_NAME_XPATH).click();
        return new ProductPage();
    }

    public ElementsCollection addAllEnabledProductsNames() {
        return $$(PRODUCT_NAME_XPATH);
    }

    public MainPageOnliner switchToiFrame() {
        switchTo().frame($(By.xpath(IFRAME_XPATH)));
        return this;
    }
}
