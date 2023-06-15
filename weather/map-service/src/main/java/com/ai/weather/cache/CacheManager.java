package com.ai.weather.cache;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.ai.weather.vo.client.Weather;


/**
 * cache manager for weather data
 */
@Service
public class CacheManager {

    private HashMap<String, Weather> cache = new HashMap<>();

    public Weather getWeather(String city) {
        if (!cache.containsKey(city)) {
            return null;
        }

        return cache.get(city);
    }

}
