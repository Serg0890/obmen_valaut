package ru.skillbox.currency.exchange.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameValueDto {

    private String name;
    private Double value;



}
