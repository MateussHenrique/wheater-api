package com.mateus.wheaterapi.model;

public class Weather {

    private String city;
    private double temperature;
    private double humidity;
    private double feelsLike;
    private double windSpeed;

    public Weather() {
    }

    public Weather(String city, double temperature, double humidity,
                   double feelsLike, double windSpeed) {

        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}