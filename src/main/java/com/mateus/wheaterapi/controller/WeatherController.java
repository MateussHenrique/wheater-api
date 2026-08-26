package com.mateus.wheaterapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WeatherController {
    @GetMapping("/weather")
    public String getWeather(@RequestParam String city) {
        return "Consultando o clima de: " + city;
    }
}
