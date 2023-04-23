package org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects;

import org.it_academy.selenium_study.framework.Driver;
import org.it_academy.selenium_study.framework.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;

public class ProductPage extends BasePage {
    private static final String PRODUCT_PAGE_TITLE_XPATH_PATTERN =
            "//*[contains(@class, 'header_title') and contains(text(), '%s')]";

    private static final String PRODUCT_GROUP = "//div[@class=\"schema-product__group\"]";


    public List<WebElement> getListOfProductsElements() {
        return Driver.getWebDriver().findElements(By.xpath(PRODUCT_GROUP));
    }
}
