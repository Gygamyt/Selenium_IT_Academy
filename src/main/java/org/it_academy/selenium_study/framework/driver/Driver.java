package org.it_academy.selenium_study.framework.driver;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.it_academy.selenium_study.framework.configs.TestsConfig;

import static org.it_academy.selenium_study.framework.configs.TestsConfig.initConfig;

public class Driver {

    public static void initDriver() {

        initConfig();

        Configuration.pageLoadStrategy = "normal";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;

        Configuration.headless = TestsConfig.isHeadless();

        switch (TestsConfig.browser) {
            case "chrome" -> Configuration.browser = Browsers.CHROME;
            case "edge" -> Configuration.browser = Browsers.EDGE;
            case "firefox" -> Configuration.browser = Browsers.FIREFOX;
            case "grid" -> {
                RemoteWebDriverCreator driverCreator = new RemoteWebDriverCreator();
                driverCreator.create();
            }
        }
    }
}
