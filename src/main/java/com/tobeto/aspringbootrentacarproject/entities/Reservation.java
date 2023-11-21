package com.tobeto.aspringbootrentacarproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "reservations")
@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @Column(name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "begining_date")
    private LocalDate beginingDate;


    @Column(name = "end_date")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name="current_loc_id")
    private CurrentOffice currentOffice;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name ="car_id")
    private Car car;

}
