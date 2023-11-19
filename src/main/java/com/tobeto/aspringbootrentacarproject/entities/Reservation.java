package com.tobeto.aspringbootrentacarproject.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "reservations")
@Entity
public class Reservation {

    @Id
    @Column(name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "begining_date")
    private LocalDateTime beginingDate;


    @Column(name = "end_date")
    private LocalDateTime endDate;

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
