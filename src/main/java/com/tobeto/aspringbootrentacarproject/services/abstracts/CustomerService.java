package com.tobeto.aspringbootrentacarproject.services.abstracts;

import com.tobeto.aspringbootrentacarproject.entities.Customer;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.responses.GetListCustomerRespose;

import java.util.List;

public interface CustomerService {

    void add(AddCustomerRequest request);
    void delete(DeleteCustomerRequest request);
    void update(UpdateCustomerRequest request);

    List<Customer> getAll();
    Customer getById(int id);

    List<Customer>getByFirstName(String firstName);

    List<GetListCustomerRespose>getByStateDto(String state);


}
