package com.alfabattle.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Rates {

  @JsonProperty("base")
  private String base;

  @JsonProperty("date")
  private String date;

  @JsonProperty("rates")
  private Map<String, Double> rates;
}