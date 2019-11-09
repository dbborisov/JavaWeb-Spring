package com.example.demo.service.services;

import com.example.demo.service.models.CarServiceModel;

import java.util.List;

public interface CarService  {

    List<CarServiceModel> findAll();

    boolean save(CarServiceModel carServiceModel);
}
