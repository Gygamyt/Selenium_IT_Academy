package org.it_academy.selenium_study;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;

public class TestsBase {
    @AfterEach
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
