package com.example.demo.service.services.impl;

import com.example.demo.data.models.Car;
import com.example.demo.data.repository.CarRepository;
import com.example.demo.service.models.CarServiceModel;
import com.example.demo.service.services.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {

    private final ModelMapper modelMapper;
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(ModelMapper modelMapper, CarRepository carRepository) {
        this.modelMapper = modelMapper;
        this.carRepository = carRepository;
    }

    @Override
    public List<CarServiceModel> findAll() {
        return this.carRepository.findAll()
                .stream()
                .map(e->this.modelMapper.map(e,CarServiceModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public boolean save(CarServiceModel carServiceModel) {
        try {
            this.carRepository.save(this.modelMapper.map(carServiceModel, Car.class));
            return true;
        }catch (Exception e){
            System.out.println("can't save !!! CareServiceImpl");
            e.printStackTrace();
            return false;
        }

    }
}
