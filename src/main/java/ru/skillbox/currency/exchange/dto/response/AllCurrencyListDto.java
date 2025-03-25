package ru.skillbox.currency.exchange.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseForAllCurrency {

    private List<NameValueDto> currencies;


//    private Double value;
//
//    private String name;


}
