package com.alfabattle.controller;

import com.alfabattle.client.WeatherFeignClient;
import com.alfabattle.dto.Rates;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final WeatherFeignClient weatherFeignClient;

  @GetMapping("/hello")
  public Rates hello(@RequestParam(value = "currency", required=false) String currency) {
    return weatherFeignClient.getRates(currency);
  }
}
