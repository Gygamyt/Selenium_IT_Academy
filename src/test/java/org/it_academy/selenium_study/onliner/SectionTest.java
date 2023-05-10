package org.it_academy.selenium_study.onliner;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Attachment;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.CatalogPage;
import org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects.Header;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SectionTest extends OnlinerBaseTest {
    private final Header header = new Header();

    private final List<String> requiredSections = new ArrayList<>() {{
        add("Электроника");
        add("Компьютеры и сети");
        add("Бытовая техника");
        add("На каждый день");
        add("Стройка и ремонт");
        add("Дом и сад");
        add("Авто и мото");
        add("Красота и спорт");
        add("Детям и мамам");
    }};

    private final List<String> currentSections = new ArrayList<>();

    @Attachment
    @Test
    public void sectionCheckTest() {
        header
                .clickOnMainNavigationLink("Каталог");

        ElementsCollection sectionsWebElements = new CatalogPage().getSectionsElements();

        sectionsWebElements.forEach(selenideElement -> currentSections.add(selenideElement.getText()));

        assertThat(currentSections)
                .as("Current sections does match the required sections.")
                .containsAll(requiredSections);
    }
}
