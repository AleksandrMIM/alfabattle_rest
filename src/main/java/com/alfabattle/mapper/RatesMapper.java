package com.alfabattle.mapper;

import com.alfabattle.api.TestResponse;
import com.alfabattle.dto.Rates;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 11:45
 */
@Mapper(componentModel = "spring")
public interface RatesMapper {

  @Mapping(source = "date", target = "requestDate")
  TestResponse map(Rates rates);
}
