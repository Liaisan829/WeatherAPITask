package ru.kpfu.itis.akhmetova.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.akhmetova.DataAboutWeather;

import java.util.Optional;

@RestController
public class WeatherController {
    DataAboutWeather DataAboutWeather = new DataAboutWeather();

    @GetMapping("/weather")
    public String getWeather(@RequestParam Optional<String> city){
        return DataAboutWeather.getDataAboutWeather(city.orElse("Kazan"));
      }
}
