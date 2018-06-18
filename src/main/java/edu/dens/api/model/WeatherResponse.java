package edu.dens.api.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class WeatherResponse {

    private long id;
    private String name;
    private int cod;
    private Coordinate coord;
    private List<Weather> weather;
    private String base;
    private MainData main;
    private long visibility;
    private WindData wind;
    private CloudsData clouds;
    private long dt;
    private SystematicData sys;

    public WeatherResponse() {
    }

    public WeatherResponse(long id, String name, int cod, Coordinate coord, List<Weather> weather, String base, MainData main, long visibility, WindData wind, CloudsData clouds, long dt, SystematicData sys) {
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainData getMain() {
        return main;
    }

    public void setMain(MainData main) {
        this.main = main;
    }

    public long getVisibility() {
        return visibility;
    }

    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    public WindData getWind() {
        return wind;
    }

    public void setWind(WindData wind) {
        this.wind = wind;
    }

    public CloudsData getClouds() {
        return clouds;
    }

    public void setClouds(CloudsData clouds) {
        this.clouds = clouds;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public SystematicData getSys() {
        return sys;
    }

    public void setSys(SystematicData sys) {
        this.sys = sys;
    }
}
