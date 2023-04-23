package org.it_academy.selenium_study.onliner;

import org.it_academy.selenium_study.TestsBase;
import org.it_academy.selenium_study.framework.Driver;
import org.junit.jupiter.api.BeforeEach;

public class OnlinerTestsBase extends TestsBase {
    @BeforeEach
    public void setUpBrowserAndOpenOnliner() {
        Driver.getWebDriver().get("https://www.onliner.by/");
    }
}
