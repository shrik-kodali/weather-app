package com.ai.weather.controller;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ai.weather.service.WeatherService;
import com.ai.weather.vo.CityWeather;
import com.ai.weather.vo.client.Weather;


/**
 * Rest Controller for forecasting applicatoin that integrates with the OpenWeatherap API and Google Maps API.
 * will allow users to retrieve weather information for a given location/ city and visualize th weather conditionss
 * on a map
 */
@Controller
@RequestMapping("/weather")
public class MapController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/getWeather")
    public String getCurrentWeather(@RequestParam(value = "city") String city, Model model) {

        // default City Weather
        CityWeather cityWeather = new CityWeather(new BigDecimal(74), 50, new BigDecimal(13), "sunny",
                new BigDecimal(30.2672), new BigDecimal(-97.7431));

        // get current weather from OpenWeather API
        Weather weather = weatherService.getWeather(city);
        cityWeather.setTemperature(weather.getMain().getTemp());
        cityWeather.setHumidity(weather.getMain().getHumidity());
        cityWeather.setWindSpeed(weather.getWind().getSpeed());
        cityWeather.setCondition(weather.getDescription());

        cityWeather.setLat(weather.getCoord().getLat());
        cityWeather.setLon(weather.getCoord().getLon());

        model.addAttribute("weather", cityWeather);
        return "weather-map";
    }

}
    
