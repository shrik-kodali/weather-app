package com.ai.weather.vo.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;


/**
 * Coord holds the longitude and latitude of a location.
 */
@Getter
@Builder
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Coord {
   BigDecimal lon;
   BigDecimal lat;
} 
