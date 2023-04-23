package org.it_academy.selenium_study.framework;

import org.it_academy.selenium_study.framework.driver_creators.ChromeDriverCreator;
import org.it_academy.selenium_study.framework.driver_creators.EdgeDriverCreator;
import org.it_academy.selenium_study.framework.driver_creators.FirefoxDriverCreator;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Arrays;

public enum DriversEnum {
    CHROME("chrome", new ChromeDriverCreator()),
    FIREFOX("firefox", new FirefoxDriverCreator()),
    EDGE("edge", new EdgeDriverCreator());

    private final String driverType;
    private final WebDriverCreator<RemoteWebDriver> webDriverCreator;

    DriversEnum(String driverType, WebDriverCreator<RemoteWebDriver> webDriverCreator) {
        this.driverType = driverType;
        this.webDriverCreator = webDriverCreator;
    }

    public String getDriverType() {
        return driverType;
    }

    public WebDriverCreator<RemoteWebDriver> getWebDriverCreator() {
        return webDriverCreator;
    }

    public static DriversEnum getByDriverType(String driverType) {
        return Arrays.stream(DriversEnum.values())
                .filter(driver -> driver.getDriverType().equals(driverType))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Driver type '" + driverType + "' is not specified in Driver enum"));
    }
}