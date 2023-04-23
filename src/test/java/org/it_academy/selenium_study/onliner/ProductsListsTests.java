package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.Header;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.ProductPage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ProductsListsTests extends OnlinerTestsBase {

    private final Header header = new Header();
    private final ProductPage productPage = new ProductPage();

    @Test
    public void headphonesListTest() {
        header
                .clickOnMainNavigationLink("Каталог")
                .clickOnCatalogClassifierLink("Электроника")
                .clickOnCatalogClassifierCategoryLink("Аудиотехника")
                .clickOnProductLink("Наушники");
        productPage.getListOfProductsElements().forEach(webElement -> assertThat(webElement.isEnabled()).isTrue());
    }
}
