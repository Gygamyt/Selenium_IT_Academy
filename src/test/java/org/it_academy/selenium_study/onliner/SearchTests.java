package org.it_academy.selenium_study.onliner;

import com.codeborne.selenide.ElementsCollection;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.MainPageOnliner;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.ProductPage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SearchTests extends OnlinerTestsBase {

    private final String SEARCH_REQUEST = "samsung galaxy s20";

    private final MainPageOnliner mainPageOnliner = new MainPageOnliner();

    private final ProductPage productPage = new ProductPage();

    @Test
    public void isSearchResultsExist() {
        mainPageOnliner
                .search(SEARCH_REQUEST);
        assertThat(mainPageOnliner.iFrameCheck()).isTrue();
    }

    @Test
    public void checkRequestedResults() {
        mainPageOnliner
                .search(SEARCH_REQUEST);

        ElementsCollection utilElementsCollection = mainPageOnliner
                .addAllEnabledProductsNames();

        utilElementsCollection.forEach(selenideElement -> assertThat(selenideElement.getText()
                .contains(SEARCH_REQUEST)).isTrue());
    }

    @Test
    public void checkOffers() {
        List<String> resultsForCheck = new ArrayList<>() {{
            add("�������� � ����");
            add("����������� ���������");
            add("�������� ��� �����!");
            add("�����");
            add("���������� ����������");
            add("�������� �� ������!");
        }};
        List<String> stringsFromElements = new ArrayList<>();

        mainPageOnliner
                .search(SEARCH_REQUEST)
                .switchToiFrame()
                .clickOnProductLink();

        ElementsCollection utilElementsCollection = productPage.addElementsForCheck();

        utilElementsCollection.forEach(selenideElement ->
                stringsFromElements.add(selenideElement.getText()));

        assertThat(stringsFromElements).containsAll(resultsForCheck);
    }
}
