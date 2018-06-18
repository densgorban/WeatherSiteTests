package edu.dens.selenide;

import com.codeborne.selenide.Selenide;
import edu.dens.api.data.Wind;
import edu.dens.api.model.WeatherResponse;
import edu.dens.api.rest.RestClient;
import edu.dens.api.rest.WeatherI;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Map;

import static edu.dens.selenide.components.WeatherPage.weatherPage;
import static org.junit.Assert.assertEquals;

public class WeatherUITest extends AbstractUITest{

    @Test
    public void getWeatherInfoAndCompareWithSite(){


        Selenide.open("/weather/today/l/UKXX0085:1:UK");
        Map<String, String> todayWeatherData = weatherPage().todayWeather().getRows();

        ;
        WeatherResponse response = RestClient.instance().getCurrentWeatherInfo();

        //this asserts won'not work becasue Weather.com caches old weather info,
        // but api.openweathermap.org return current actual info
        //todo: think how to overcome this issue
        Wind wind = Wind.valueOf(response.getWind().getDeg());
        float speed = response.getWind().getSpeed();
        assertEquals("Humidity should be equal",todayWeatherData.get("Humidity"), String.valueOf(response.getMain().getHumidity()));
        assertEquals("Wind should be equal",todayWeatherData.get("Wind"), String.format("%s %d mph", wind, speed));
    }
}
