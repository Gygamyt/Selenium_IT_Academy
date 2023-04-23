package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.CatalogPage;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.Header;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SectionsTest extends OnlinerTestsBase {
    private final Header header = new Header();
    private final CatalogPage catalogPage = new CatalogPage();

    private final ArrayList<String> requiredSections = new ArrayList<>(){{
       add("��������, ����������, ��������");
       add("�������������");
    }};

    @Test
    public void sectionComputersTest() {
        header
                .clickOnMainNavigationLink("�������")
                .clickOnCatalogClassifierLink("����������");
        requiredSections.forEach(section -> assertThat(catalogPage.isCatalogNavigationListDisplayed(section))
                .as("Trouble msg.")
                .isTrue());
    }
}
