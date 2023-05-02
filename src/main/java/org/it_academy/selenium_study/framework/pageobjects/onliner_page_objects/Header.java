package org.it_academy.selenium_study.framework.pageobjects.onliner_page_objects;

import org.it_academy.selenium_study.framework.pageobjects.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class Header extends BasePage {
    private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

    private final By onlinerLogo = By.xpath("//*[contains(@class, 'onliner_logo')]");


    public CatalogPage clickOnMainNavigationLink(String link) {
        $(By.xpath(format(MAIN_NAVIGATION_LINK_XPATH_PATTERN, link))).click();
        return new CatalogPage();
    }
}
