package com.example.demo.web.controller;

import com.example.demo.service.services.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class HomeController {

    public ModelMapper modelMapper;
    public CarService carService;

    @Autowired
    public HomeController(ModelMapper modelMapper, CarService carService) {
        this.modelMapper = modelMapper;
        this.carService = carService;
    }

    @GetMapping("/")
    protected ModelAndView home(ModelAndView modelAndView) {

        modelAndView.setViewName("home.html");
        return modelAndView;
    }
    @GetMapping("/all")
    public ModelAndView all(ModelAndView modelAndView){
        modelAndView.setViewName("all.html");

        modelAndView.addObject()
        return modelAndView;

    }

    @GetMapping("/create")
    public ModelAndView addCar(ModelAndView modelAndView){
        modelAndView.setViewName("create.html");
        return modelAndView;

    }

}
