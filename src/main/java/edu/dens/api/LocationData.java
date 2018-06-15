package edu.dens.api;

import com.google.gson.Gson;
import edu.dens.api.model.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class LocationData {
    private static List<Location> locations;

    public static Location getLocation(String name){
        if(locations ==  null) {
            try {
                FileReader json = new FileReader("src//main//resources//test.city.list.json");
                locations = Arrays.asList(new Gson().fromJson(json, Location[].class));
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Unable to find JSON file with test data");

            }
        }
        return locations.stream().filter(location -> location.getName().equals(name)).findFirst().get();
    }
}
