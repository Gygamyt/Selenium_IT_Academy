package org.it_academy.selenium_study;

import org.it_academy.selenium_study.framework.Driver;
import org.junit.jupiter.api.AfterEach;

public class TestsBase {
    @AfterEach
    public void closeBrowser() {
        Driver.shutDownDriver();
    }
}
