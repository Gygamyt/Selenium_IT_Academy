package org.it_academy.selenium_study.onliner;

import com.codeborne.selenide.ElementsCollection;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.CatalogPage;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.Header;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CatalogNavigationTest extends OnlinerBaseTest {

    private final String REGULAR_EXPRESSION_FOR_COMPONENTS_CHECK =
            "^[^\\r\\n]*\\n\\d{1,3}(,\\d{3})*(\\s+|\\s*(?=�����[��]'a'))(�������|������|�����)\\n��\\s\\d+(?:,\\d+)?\\s�\\.";
    private final Header header = new Header();

    private final List<String> currentComponents = new ArrayList<>();

    @Test
    public void componentListTest() {
        header
                .clickOnMainNavigationLink("�������")
                .clickOnCatalogClassifierLink("����������")
                .clickOnCatalogClassifierCategoryLink("�������������");

        ElementsCollection sectionsWebElements = new CatalogPage().getCatalogNavigation();

        sectionsWebElements.forEach(webElement -> currentComponents.add(webElement.getText()));

        currentComponents.forEach(components -> assertThat(components.matches(REGULAR_EXPRESSION_FOR_COMPONENTS_CHECK))
                .as("Element fails validation")
                .isTrue());
    }
}
