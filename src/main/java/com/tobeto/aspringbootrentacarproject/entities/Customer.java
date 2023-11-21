package com.tobeto.aspringbootrentacarproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "customers")
@Entity
@Getter
@Setter
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

   @Column(name ="country")
    private String country;

   @Column(name = "address")
    private String address;

   @Column(name = "state")
    private String state;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Reservation> reservations;


}
