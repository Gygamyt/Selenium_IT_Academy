package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.framework.Driver;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.CatalogPage;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.Header;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SectionTest extends OnlinerTestsBase {
    private final Header header = new Header();

    private final List<String> requiredSections = new ArrayList<>() {{
        add("�����������");
        add("���������� � ����");
        add("������� �������");
        add("�� ������ ����");
        add("������� � ������");
        add("��� � ���");
        add("���� � ����");
        add("������� � �����");
        add("����� � �����");
    }};

    private final ArrayList<String> currentSections = new ArrayList<>();

    @Test
    public void sectionCheckTest() {
        header
                .clickOnMainNavigationLink("�������");

        List<WebElement> sectionsWebElements = Driver.getWebDriver()
                .findElements(By.xpath(CatalogPage.CATALOG_CLASSIFIER_XPATH_FOR_SECTION_CHECK));

        sectionsWebElements.forEach(webElement -> currentSections.add(webElement.getText()));

        assertThat(currentSections)
                .as("Current sections does match the required sections.")
                .containsAll(requiredSections);
    }
}
