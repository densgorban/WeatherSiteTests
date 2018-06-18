package edu.dens.selenide;

import com.codeborne.selenide.Configuration;

public class AbstractUITest {
    static {
        Configuration.baseUrl = System.getProperty("base.url", "https://weather.com");
        Configuration.browser = "chrome";
        Configuration.timeout = Long.parseLong(System.getProperty("short-timeout", "3000"));
        Configuration.browserSize = System.getProperty("selenide.browser-size", "1280x1024");
    }
}