package com.example.demo.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false,name = "brand")
    private String brand;
    @Column(nullable = false, name ="model" )
    private String model;
    @Column(nullable = false,name = "engine" )
    private String engine;
    @Column(nullable = false,name = "year")
    private String year;


}
