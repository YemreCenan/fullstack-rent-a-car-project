package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.Customer;
import com.tobeto.aspringbootrentacarproject.repositories.CustomerRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.CustomerService;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.responses.GetListCustomerRespose;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("getAll")
    public List<Customer> getAll() {

        return customerService.getAll();
    }

    @GetMapping("getById")
    public Customer getById(int id){
        return customerService.getById(id);
    }

    @PostMapping("/add/")
    public void add (@Valid AddCustomerRequest request){
        customerService.add(request);
    }

    @DeleteMapping("/delete/")
    public void delete(DeleteCustomerRequest request){
      customerService.delete(request);
    }

    @PutMapping("/update/")
    public void update(UpdateCustomerRequest request){
        customerService.update(request);

    }

    @GetMapping("/filter/FirstName")
    public List<Customer> getByFirstName(@RequestParam String firstName){
        return customerService.getByFirstName(firstName);
    }



    }

