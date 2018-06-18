package edu.dens.selenide.components;

import com.codeborne.selenide.Condition;
import edu.dens.selenide.WeatherUITest;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WeatherPage {

    public WeatherPage(By root){
        $(root).shouldBe(exist, visible);
    }

    public static WeatherPage weatherPage(){
        return new WeatherPage(By.cssSelector(".region.region-top"));
    }

    public HtmlTable todayWeather(){
        return new HtmlTable(By.className("today_nowcard-sidecar"));
    }


}
