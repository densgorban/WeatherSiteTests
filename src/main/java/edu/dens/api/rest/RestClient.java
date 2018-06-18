package edu.dens.api.rest;

import edu.dens.api.model.Weather;
import edu.dens.api.model.WeatherResponse;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient implements WeatherI{

    public Client client;
    private static RestClient instance;

    String apiUrl = System.getProperty("api.url", "http://api.openweathermap.org");

    public RestClient() {
        client = new ResteasyClientBuilder().build();
    }

    public static RestClient instance(){
        if(instance == null) instance = new RestClient();
        return instance;
    }

    @Override
    public WeatherResponse getCurrentWeatherInfo() {
        String url = String.format("%s/data/2.5/weather?id=%s&APPID=%s", apiUrl, "2643743", "6f37737f30fdd7dfd9600ca4726ef24f");
        Response response = client
                .target(url)
                .request(MediaType.APPLICATION_JSON)
                .get();
        return response.readEntity(WeatherResponse.class);
    }
}
