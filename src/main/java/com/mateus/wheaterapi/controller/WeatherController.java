package com.mateus.wheaterapi.controller;

import com.mateus.wheaterapi.model.Weather;
import com.mateus.wheaterapi.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public Weather getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}