package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.Customer;
import com.tobeto.aspringbootrentacarproject.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getAll() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable int id){
        return customerRepository.findById(id).orElseThrow();
    }

    @PostMapping("/add/{id}")
    public void add (@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        Customer deleteToCustomer = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(deleteToCustomer);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id,@RequestBody Customer customer){
        Customer customerToUpdate = customerRepository.findById(id).orElseThrow();
        customerToUpdate.setIdentiNumber(customer.getIdentiNumber());
        customerToUpdate.setFirstName(customer.getFirstName());
        customerToUpdate.setLastName(customer.getLastName());
        customerToUpdate.setMobil(customerToUpdate.getMobil());
        customerToUpdate.setEmail(customerToUpdate.getEmail());
        customerToUpdate.setCountry(customerToUpdate.getCountry());
        customerToUpdate.setAddress(customerToUpdate.getAddress());
        customerToUpdate.setState(customerToUpdate.getState());
        customerRepository.save(customerToUpdate);
    }


    }

