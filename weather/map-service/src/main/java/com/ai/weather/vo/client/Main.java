package com.ai.weather.vo.client;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;


/**
 * Main holds the data for temperature, pressure & humidity
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Main {
    private BigDecimal temp;
    private BigDecimal pressure;
    private int humidity;
}