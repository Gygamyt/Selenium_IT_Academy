package org.it_academy.selenium_study.framework.driver_creators;

import org.it_academy.selenium_study.framework.WebDriverCreator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverCreator implements WebDriverCreator<RemoteWebDriver> {
    @Override
    public RemoteWebDriver create() {
        return new ChromeDriver();
    }
}