package com.ai.weather.client;

import com.ai.weather.vo.client.Weather;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.cloud.openfeign.FeignClient;


/**
 * client for weather openWeatherMap service
 */
@FeignClient(name = "openWeatherMapClient", url = "${weather.map-url}") public interface WeatherClient {
    @GetMapping(value = "/data/2.5/weather") Weather getWeatherByCity(@RequestParam("q") String cityName,
            @RequestParam("appid") String appKey, @RequestParam String units);

}
