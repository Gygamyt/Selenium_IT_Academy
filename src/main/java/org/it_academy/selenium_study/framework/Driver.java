package org.it_academy.selenium_study.framework;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.it_academy.selenium_study.framework.configs.TestsConfig;

public class Driver {

    public static void initDriver() {
        TestsConfig.initConfig();

        Configuration.pageLoadStrategy = "normal";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.headless = TestsConfig.isHeadless();

        switch (TestsConfig.browser) {
            case "chrome" -> Configuration.browser = Browsers.CHROME;
            case "firefox" -> Configuration.browser = Browsers.FIREFOX;
            case "edge" -> Configuration.browser = Browsers.EDGE;
        }
    }
}