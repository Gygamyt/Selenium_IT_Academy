package org.it_academy.selenium_study.framework;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;

public class Driver {

    public static void initDriver() {
        Configuration.pageLoadStrategy = "normal";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.browser = Browsers.CHROME;
        Configuration.headless = false;
    }
}