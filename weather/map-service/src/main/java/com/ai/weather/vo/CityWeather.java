package com.ai.weather.vo;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * CityWeather class to hold the weather information for a city.
 */
public class CityWeather implements Serializable {

    private BigDecimal temperature;
    private int humidity;
    private BigDecimal windSpeed;
    private String condition;

    private BigDecimal lat;

    private BigDecimal lon;

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(final BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(final BigDecimal lon) {
        this.lon = lon;
    }

    public CityWeather(BigDecimal temperature, int humidity, BigDecimal windSpeed, String condition, BigDecimal lat,
            BigDecimal lon) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.condition = condition;
        this.lon = lon;
        this.lat = lat;
    }

    public CityWeather() {

    }

}
