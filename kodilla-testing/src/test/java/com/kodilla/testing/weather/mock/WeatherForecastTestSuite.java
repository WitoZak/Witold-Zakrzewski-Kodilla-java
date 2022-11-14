package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach()

    @DisplayName("Testing Mock")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @DisplayName("Testing Average Temperature")
    @Test
    void testCalculateAverageTemperature() {

        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperatureMap = new HashMap<>();
        temperatureMap.put("Rzeszow", 25.5);
        temperatureMap.put("Krakow", 26.2);
        temperatureMap.put("Wroclaw", 24.8);
        temperatureMap.put("Warszawa", 25.2);
        temperatureMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperatureMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemperatures = weatherForecast.averageTemperatureCalc(temperaturesMock.getTemperatures());

        //Then
        Assertions.assertEquals(25.56, averageTemperatures);
    }
    @DisplayName("Testing Average Median Temperature")
    @Test
    void testCalculateAverageMedianTemperature() {

        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperatureMap = new HashMap<>();
        temperatureMap.put("Rzeszow", 25.5);
        temperatureMap.put("Krakow", 26.2);
        temperatureMap.put("Wroclaw", 24.8);
        temperatureMap.put("Warszawa", 25.2);
        temperatureMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperatureMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageMedianTemperatures = weatherForecast.averageTemperatureMedian(temperaturesMock.getTemperatures());

        //Then
        Assertions.assertEquals(25.5, averageMedianTemperatures);
    }
}