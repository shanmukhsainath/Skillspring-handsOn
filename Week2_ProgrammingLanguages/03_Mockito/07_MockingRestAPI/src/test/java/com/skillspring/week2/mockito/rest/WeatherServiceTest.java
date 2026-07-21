package com.skillspring.week2.mockito.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherServiceTest {
    @Test
    void shouldMockRestClientResponse() {
        WeatherClient weatherClient = mock(WeatherClient.class);
        when(weatherClient.getWeather("Chennai")).thenReturn("Sunny");
        WeatherService weatherService = new WeatherService(weatherClient);
        assertEquals("Weather in Chennai: Sunny", weatherService.getWeatherReport("Chennai"));
    }
}
