package com.tobeto.aspringbootrentacarproject.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "customers")
@Entity
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "identi_number")
    private int identiNumber;

    @Column(name = "first_name")
    private String firstName;


   @Column(name ="last_name")
    private String lastName;


   @Column(name = "mobil")
    private int mobil;

   @Column(name = "email")
    private String email;

   @Column(name ="county")
    private String county;

   @Column(name = "address")
    private String address;

   @Column(name = "state")
    private String state;

    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservations;


}
