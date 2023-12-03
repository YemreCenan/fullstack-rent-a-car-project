package com.tobeto.aspringbootrentacarproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Table(name = "cars")
@Entity
@Getter
@Setter
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "color")
    private String color;

    @Column(name ="status")
    private String status;

    @Column(name = "fuel_type")
    private String fuelType;

  @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

 @ManyToOne
    @JoinColumn(name = "current_loc_id")
    private CurrentOffice currentOffice;


   @OneToMany(mappedBy = "car")
   @JsonIgnore
    private List<Reservation>reservations;




}
