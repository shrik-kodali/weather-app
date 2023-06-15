package com.ai.weather.service;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ai.weather.cache.CacheManager;
import com.ai.weather.client.WeatherClient;
import com.ai.weather.vo.client.Weather;


/**
 * service class for weather
 */

@Service
@RequiredArgsConstructor
public class WeatherService {

    @Value("${weather.api-key}")
    private String apiKey;
    @Value("${weather.api-units}")
    private String units;

    @Autowired
    private final WeatherClient weatherClient;

    @Autowired
    CacheManager cacheManager;

    public Weather getWeather(String city) {

        Weather weather = cacheManager.getWeather(city);

        if (Objects.nonNull(weather)) {
            return weather;
        }

        return weatherClient.getWeatherByCity(city, apiKey, units);
    }

}


