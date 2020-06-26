package com.alfabattle.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Rates {

  private String base;
  private String date;
  private Map<String, Double> rates;
}