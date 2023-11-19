package com.tobeto.aspringbootrentacarproject.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "office_phone")
@Entity
public class OfficePhone {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "phone_one")
    private int phoneOne;


    @Column(name = "phone_two")
    private int phoneTwo;


    @OneToMany(mappedBy = "officePhone")
    private List<CurrentOffice> currentOffices;




}
