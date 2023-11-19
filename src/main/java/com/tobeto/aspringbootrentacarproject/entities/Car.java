package com.tobeto.aspringbootrentacarproject.entities;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Table(name = "cars")
@Entity
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "model_names")
    private String modelName;

    @Column(name = "daily_price")
    private BigDecimal dailyPrice;

    @Column(name = "color")
    private String color;

    @Column(name ="status")
    private String status;

    @Column(name="fuel_type")
    private String fuelType;

  @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

 @ManyToOne
    @JoinColumn(name = "current_loc_id")
    private CurrentOffice currentOffice;


   @OneToMany(mappedBy = "car")
    private List<Reservation>reservations;




}
