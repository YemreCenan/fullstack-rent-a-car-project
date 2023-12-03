package com.tobeto.aspringbootrentacarproject.repositories;

import com.tobeto.aspringbootrentacarproject.entities.Customer;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.responses.GetListCustomerRespose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {




 List<Customer>findByFirstNameStartingWith(String firstName);


//Available car
 @Query("Select new com.tobeto.aspringbootrentacarproject.services.dtos.customer.responses.GetListCustomerRespose(c.identiNumber,c.firstName,c.lastName,c.state)"+
         "From Customer c where c.state = :state")

 List<GetListCustomerRespose>findByState(String state);


}
