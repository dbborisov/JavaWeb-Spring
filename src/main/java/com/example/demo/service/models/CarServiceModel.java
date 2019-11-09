package com.example.demo.service.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CarServiceModel {

    private String id;
    private String brand;
    private String model;
    private String engine;
    private String year;

}
