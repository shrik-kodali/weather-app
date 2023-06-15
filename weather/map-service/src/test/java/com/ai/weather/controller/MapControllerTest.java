package com.ai.weather.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MapControllerTest {

    @Test
    void getCurrentWeather() {
        MapController mapController = new MapController();
        assertNotNull(mapController);

    }
}