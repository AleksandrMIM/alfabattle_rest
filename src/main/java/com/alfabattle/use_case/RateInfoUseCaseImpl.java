package com.alfabattle.use_case;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;
import com.alfabattle.client.WeatherFeignClient;
import com.alfabattle.mapper.RatesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 12:19
 */
@Service
@RequiredArgsConstructor
public class RateInfoUseCaseImpl implements RateInfoUseCase {

  private final WeatherFeignClient weatherFeignClient;
  private final RatesMapper ratesMapper;

  @Override
  public @NotNull TestResponse getRate(@NotNull TestRequest testRequest) {
    var rates = weatherFeignClient.getRates(testRequest.getCurrency());

    var testResponse = ratesMapper.map(rates);
    testResponse.setRequestDate(testRequest.getLocalDate().toString());
    return testResponse;
  }
}
