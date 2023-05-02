package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.TestsBase;
import org.it_academy.selenium_study.framework.Driver;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class OnlinerTestsBase extends TestsBase {
    @BeforeEach
    public void setUpBrowserAndOpenOnliner() {
        Driver.initDriver();
        open("https://www.onliner.by/");
    }
}
