package com.dev.health.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class CalorieInfoDto {
    private LocalDate date;
    private int calorie;
}
