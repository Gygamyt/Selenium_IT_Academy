package org.it_academy.selenium_study.framework;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriverCreator <T extends RemoteWebDriver>{
    T create();
}