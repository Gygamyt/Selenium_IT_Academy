package org.it_academy.selenium_study.onliner;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.it_academy.selenium_study.LinksForTestsEnum;
import org.it_academy.selenium_study.BaseTest;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class OnlinerBaseTest extends BaseTest {
    @BeforeEach
    public void openOnliner() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
        open(LinksForTestsEnum.ONLINER.getLink());
    }
}
