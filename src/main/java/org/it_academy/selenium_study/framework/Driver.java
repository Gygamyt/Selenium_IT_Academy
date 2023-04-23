package org.it_academy.selenium_study.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static final ThreadLocal<WebDriver> localStorage = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        if (localStorage.get() == null) {
            startDriver();
        }
        return localStorage.get();
    }

    private static void setUpWebDriver(RemoteWebDriver webDriver) {
        localStorage.set(webDriver);
        localStorage.get().manage().window().maximize();
        localStorage.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        localStorage.get().manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }

    public static void startDriver() {

//        setUpWebDriver(DriversEnum.getByDriverType(System.getProperty("driverType"))
//                .getWebDriverCreator()
//                .create());
        setUpWebDriver(DriversEnum.getByDriverType("chrome")
                .getWebDriverCreator()
                .create());
    }

    public static void shutDownDriver() {
        localStorage.get().close();
        localStorage.remove();
    }

    private static WebDriver setUpDriverWithConf() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("enable-automation");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920x1080");
        return new ChromeDriver(options);
    }
}