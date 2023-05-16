package org.it_academy.selenium_study;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.it_academy.selenium_study.framework.driver.Driver;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {


    @BeforeEach
    public void initDriver() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
        Driver.initDriver();
    }
}
