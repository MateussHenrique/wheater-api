package com.mateus.wheaterapi.service;

import com.mateus.wheaterapi.model.GeocodingResponse;
import com.mateus.wheaterapi.model.Weather;
import com.mateus.wheaterapi.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class WeatherService {

    private final RestClient restClient;

    public WeatherService() {
        this.restClient = RestClient.builder().build();
    }

    public Weather getWeather(String city) {

        GeocodingResponse geocodingResponse = restClient.get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .host("geocoding-api.open-meteo.com")
                        .path("/v1/search")
                        .queryParam("name", city)
                        .queryParam("count", 1)
                        .queryParam("language", "pt")
                        .queryParam("format", "json")
                        .build())
                .retrieve()
                .body(GeocodingResponse.class);

        double latitude = geocodingResponse
                .getResults()
                .get(0)
                .getLatitude();

        double longitude = geocodingResponse
                .getResults()
                .get(0)
                .getLongitude();

        WeatherResponse weatherResponse = restClient.get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .host("api.open-meteo.com")
                        .path("/v1/forecast")
                        .queryParam("latitude", latitude)
                        .queryParam("longitude", longitude)
                        .queryParam(
                                "current",
                                "temperature_2m,relative_humidity_2m,apparent_temperature,wind_speed_10m"
                        )
                        .build())
                .retrieve()
                .body(WeatherResponse.class);

        return new Weather(
                city,
                weatherResponse.getCurrent().getTemperature_2m(),
                weatherResponse.getCurrent().getRelative_humidity_2m(),
                weatherResponse.getCurrent().getApparent_temperature(),
                weatherResponse.getCurrent().getWind_speed_10m()
        );
    }
}