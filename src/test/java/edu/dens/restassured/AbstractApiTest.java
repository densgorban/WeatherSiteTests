package edu.dens.restassured;

import io.restassured.RestAssured;
import org.junit.Before;

public abstract class AbstractApiTest {

    protected final String API25WEATHER = "/data/2.5/weather";


    @Before
    public void setUpBeforeTest() {
        RestAssured.reset();
        RestAssured.baseURI = System.getProperty("api.url", "http://sample.openweathermap.org");
    }

}
