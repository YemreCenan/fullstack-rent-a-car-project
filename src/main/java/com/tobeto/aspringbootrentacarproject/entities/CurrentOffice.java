package com.tobeto.aspringbootrentacarproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Table(name = "current_offices")
@Entity
@Getter
@Setter
public class CurrentOffice {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "office_street")
    private String officeStreet;

    @Column(name = "office_number")
    private int officeNumber;


    @Column(name = "office_city")
    private String officeCity;

    @Column(name = "office_country")
    private String officeCountry;

    @Column(name = "office_state")
    private String officeState;

    @ManyToOne
    @JoinColumn(name="office_phone_id")
    private OfficePhone officePhone;

    @OneToMany(mappedBy = "currentOffice")
    @JsonIgnore
    private List<Car>cars;


    @OneToMany(mappedBy = "currentOffice")
    @JsonIgnore
    private List<Reservation>reservations;








}
