package com.alfabattle.controller;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;
import com.alfabattle.use_case.RateInfoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final RateInfoUseCase rateInfoUseCase;

  @GetMapping("/hello")
  public TestResponse helloGet(@RequestParam(value = "currency", required = false) String currency) {
    return rateInfoUseCase.getRate(new TestRequest(currency));
  }

  @PostMapping("/hello")
  public TestResponse helloPost(@Valid @RequestBody TestRequest testRequest) {
    return rateInfoUseCase.getRate(testRequest);
  }
}
