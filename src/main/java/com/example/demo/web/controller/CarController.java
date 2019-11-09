package com.example.demo.web.controller;

import com.example.demo.service.models.CarServiceModel;
import com.example.demo.service.services.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CarController {

    private final ModelMapper modelMapper;
    private final CarService carService;

    @Autowired
    public CarController(ModelMapper modelMapper, CarService carService) {
        this.modelMapper = modelMapper;
        this.carService = carService;
    }

    @GetMapping("/all")
    public ModelAndView all(ModelAndView modelAndView){
        modelAndView.setViewName("all");
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView){
        modelAndView.setViewName("create");
        return modelAndView;

    }

    @PostMapping("/create")
    public ModelAndView createConfirm(@ModelAttribute CarServiceModel model){
        this.carService.save(model);
        return new ModelAndView("redirect:/all");
    }
}
