package edu.dens.restassured;

import edu.dens.common.RegressionTest;
import edu.dens.common.SmokeTest;
import edu.dens.api.LocationData;
import edu.dens.api.model.Location;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static edu.dens.api.data.Applications.KEY_1;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class WeatherApiTest extends AbstractApiTest {

    @Test @Category(SmokeTest.class)
    public void getByCitiId(){
        Location location = LocationData.getLocation("London");
            given()
                .get("/data/2.5/weather?id={city_id}&APPID={app_id}", location.getId(), KEY_1)
            .then()
                .log().all()
                .and()
                    .body("cod", equalTo(200))
                    .body("id", equalTo(location.getId()))
                    .body("name", equalTo(location.getName()))
                    .body("coord.lon", equalTo(location.getCoord().getLon()))
                    .body("coord.lat", equalTo(location.getCoord().getLat()))
                    .body("weather", not(empty()))
                    .body("wind", not(empty()))
                    .body("visibility", not(empty()))
                    .body("clouds", not(empty()))
                    .body("sys", not(empty()));
    }

    @Test @Category(RegressionTest.class)
    public void get401WithUnknownAppID(){
        given()
                .get("/data/2.5/weather?id=2172797")
                .then()
                .log().all()
                .body("cod", equalTo(401))
                .body("message", containsString("Invalid API key"));
    }
}