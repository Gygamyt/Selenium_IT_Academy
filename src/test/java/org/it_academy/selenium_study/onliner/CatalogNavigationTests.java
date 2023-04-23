package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.framework.Driver;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.CatalogPage;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.Header;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import java.util.ArrayList;
import java.util.List;

public class CatalogNavigationTests extends OnlinerTestsBase {

    private final String REGULAR_EXPRESSION =
            "^[^\\r\\n]*\\n\\d{1,3}(,\\d{3})*(\\s+|\\s*(?=товар[ов]'a'))(товаров|товара|товар)\\nот\\s\\d+(?:,\\d+)?\\sр\\.";
    private final Header header = new Header();

    private final ArrayList<String> currentComponents = new ArrayList<>();

    @Test
    public void componentListTest() {
        header
                .clickOnMainNavigationLink("Каталог")
                .clickOnCatalogClassifierLink("Компьютеры")
                .clickOnCatalogClassifierCategoryLink("Комплектующие");

        List<WebElement> sectionsWebElements = Driver.getWebDriver()
                .findElements(By.xpath(CatalogPage.ANCESTOR_OF_CATALOG_NAVIGATION_LIST));

        sectionsWebElements.forEach(webElement -> currentComponents.add(webElement.getText()));

        currentComponents.forEach(components -> assertThat(components.matches(REGULAR_EXPRESSION))
                .as("Element fails validation")
                .isTrue());
    }
}
