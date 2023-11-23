package com.tobeto.aspringbootrentacarproject.services.concrtes;

import com.tobeto.aspringbootrentacarproject.entities.Customer;
import com.tobeto.aspringbootrentacarproject.repositories.CustomerRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.CustomerService;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.UpdateCustomerRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {


    private CustomerRepository customerRepository;
    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void add(AddCustomerRequest request) {

        Customer customer = new Customer();
        customer.setIdentiNumber(request.getIdentiNumber());
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setMobil(request.getMobil());
        customer.setEmail(request.getEmail());
        customer.setCountry(request.getCountry());
        customer.setAddress(request.getAddress());
        customer.setState(request.getState());
        customerRepository.save(customer);
    }

    @Override
    public void delete(DeleteCustomerRequest request) {
     Customer customerToDelete = customerRepository.findById(request.getId()).orElseThrow();
     customerRepository.delete(customerToDelete);
    }

    @Override
    public void update(UpdateCustomerRequest request) {
        Customer customerToUpdate = customerRepository.findById(request.getId()).orElseThrow();
        customerToUpdate.setIdentiNumber(request.getIdentiNumber());
        customerToUpdate.setFirstName(request.getFirstName());
        customerToUpdate.setLastName(request.getLastName());
        customerToUpdate.setMobil(request.getMobil());
        customerToUpdate.setEmail(request.getEmail());
        customerToUpdate.setCountry(request.getCountry());
        customerToUpdate.setAddress(request.getAddress());
        customerToUpdate.setState(request.getState());
        customerRepository.save(customerToUpdate);


    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList =customerRepository.findAll();
        return customerList;
    }

    @Override
    public Customer getById(int id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        return customer;
    }
}
