package com.alfabattle.client;

import com.alfabattle.dto.Rates;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "WeatherClient", url = "${weather.api.url}")
public interface WeatherFeignClient {

  @RequestMapping(method = RequestMethod.GET, value = "/latest", produces = "application/json")
  Rates getRates(@RequestParam(value = "base", required=false) String base);
}
