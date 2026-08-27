package com.mateus.wheaterapi.model;

public class WeatherResponse {

    private Current current;

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public static class Current {

        private double temperature_2m;
        private double relative_humidity_2m;
        private double apparent_temperature;
        private double wind_speed_10m;

        public double getTemperature_2m() {
            return temperature_2m;
        }

        public void setTemperature_2m(double temperature_2m) {
            this.temperature_2m = temperature_2m;
        }

        public double getRelative_humidity_2m() {
            return relative_humidity_2m;
        }

        public void setRelative_humidity_2m(double relative_humidity_2m) {
            this.relative_humidity_2m = relative_humidity_2m;
        }

        public double getApparent_temperature() {
            return apparent_temperature;
        }

        public void setApparent_temperature(double apparent_temperature) {
            this.apparent_temperature = apparent_temperature;
        }

        public double getWind_speed_10m() {
            return wind_speed_10m;
        }

        public void setWind_speed_10m(double wind_speed_10m) {
            this.wind_speed_10m = wind_speed_10m;
        }
    }
}