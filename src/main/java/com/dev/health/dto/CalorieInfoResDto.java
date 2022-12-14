package com.dev.health.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalorieInfoResDto {
    private int needCalorie;
    private int haveCalorie;

    @Builder
    public CalorieInfoResDto(int needCalorie,int haveCalorie){
        this.needCalorie = needCalorie;
        this.haveCalorie = haveCalorie;
    }
}
