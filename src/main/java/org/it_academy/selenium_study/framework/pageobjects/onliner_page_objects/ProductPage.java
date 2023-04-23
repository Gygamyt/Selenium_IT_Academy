package org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects;

import org.it_academy.selenium_study.framework.Driver;
import org.it_academy.selenium_study.framework.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class ProductPage extends BasePage {
    private static final String PRODUCT_GROUP = "//div[@class=\"schema-product__group\"]";
    private static final String FIELDS_PATTERN = "//div[contains(@class, '%s')]";

    private static final ArrayList<String> fieldsClasses = new ArrayList<>() {{
        add("schema-product__image");
        add("schema-product__compare");
        add("schema-product__price-group");
        add("schema-product__description");
        add("schema-product__title");
        add("schema-product__rating-group");
    }};

    public List<WebElement> getListOfRequiredFields() {
        List<WebElement> util = new ArrayList<>();
        for (String fieldsClass : fieldsClasses) {
            util.addAll(Driver.getWebDriver().findElements(By.xpath(format(FIELDS_PATTERN, fieldsClass))));
        }
        return util;
    }

    public List<WebElement> getListOfProductsElements() {
        return Driver.getWebDriver().findElements(By.xpath(PRODUCT_GROUP));
    }
}
