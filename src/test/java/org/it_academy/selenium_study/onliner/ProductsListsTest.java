package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.Header;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.ProductsPage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ProductsListsTest extends OnlinerBaseTest {

    private final Header header = new Header();
    private final ProductsPage productsPage = new ProductsPage();

    @Test
    public void headphonesListTest() {
        header
                .clickOnMainNavigationLink("Каталог")
                .clickOnCatalogClassifierLink("Электроника")
                .clickOnCatalogClassifierCategoryLink("Аудиотехника")
                .clickOnProductLink("Наушники");
        productsPage.getFieldsForVisibilityCheck().forEach(webElement -> assertThat(webElement.isEnabled()).isTrue());
    }
}
