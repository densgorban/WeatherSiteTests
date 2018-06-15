package edu.dens.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class WeatherUITest extends AbstractUITest{

    @Test
    public void getWeatherInfoAndComparewithSite(){
        Configuration.baseUrl = System.getProperty("base.url", "https://weather.com");
        Configuration.browser = "chrome";
        Configuration.timeout = Long.parseLong(System.getProperty("short-timeout", "3000"));
        Configuration.browserSize = System.getProperty("selenide.browser-size", "1280x1024");


        Selenide.open("/weather/today/l/UKXX0085:1:UK");
        Selenide.$(".today_nowcard-sidecar");

    }
}
