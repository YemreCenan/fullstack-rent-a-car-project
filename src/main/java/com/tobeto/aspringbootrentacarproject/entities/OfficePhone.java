package com.tobeto.aspringbootrentacarproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "office_phone")
@Entity
@Getter
@Setter
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
    @JsonIgnore
    private List<CurrentOffice> currentOffices;




}
