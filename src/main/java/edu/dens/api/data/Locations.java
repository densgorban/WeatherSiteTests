package edu.dens.api.data;

public enum Locations {
    SHUZENJI("1851632", "35", "139", "", "JP"),
    LONDON("2172797", "-0.13", "51.51", "", "GB"),
    MOUNTAIN_VIEW("", "-122.09", "37.39", "", "US");

    private String id;
    private String lat;
    private String lon;
    private String zip;
    private String country;

    Locations(String id, String lat, String lon, String zip, String country) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.zip = zip;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }
}
