package com.ai.weather.vo.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Weather holds the weather information for a city.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    Coord coord;
    Main main;
    Wind wind;
    Clouds clouds;
    String description;
}
