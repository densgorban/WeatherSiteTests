package edu.dens.api.model;

public class Location {

    private int id;
    private String name;
    private String country;
    private Coordinate coord;

    public Location(int id, String name, String country, Coordinate coord) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.coord = coord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }
}
