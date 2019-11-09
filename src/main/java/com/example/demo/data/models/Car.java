package com.example.demo.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(generator = "uuid-string")
    @GenericGenerator(name = "uuid-string",strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private String id;
    @Column(nullable = false, name = "brand")
    private String brand;
    @Column(nullable = false, name = "model")
    private String model;
    @Column(nullable = false, name = "engine")
    private String engine;
    @Column(nullable = false, name = "year")
    private String year;


}
