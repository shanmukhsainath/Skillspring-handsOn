package com.skillspring.week2.mockito.rest;

public class WeatherService {
    private final WeatherClient weatherClient;

    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    public String getWeatherReport(String city) {
        return "Weather in " + city + ": " + weatherClient.getWeather(city);
    }
}
