package com.alfabattle.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

/**
 * User: @AleksandrMIM
 * Date: 25.06.2020
 * Time: 23:32
 */
@Getter
@Setter
@NoArgsConstructor
public class TestRequest {

  @NotNull
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate localDate;
  @Pattern(regexp = "(EUR|USD)")
  private String currency;

  public TestRequest(String currency) {
    this.currency = currency;
  }
}
