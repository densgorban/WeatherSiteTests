package edu.dens.api.rest;

import edu.dens.api.model.Weather;
import edu.dens.api.model.WeatherResponse;

public interface WeatherI {

    WeatherResponse getCurrentWeatherInfo();
}
