package com.example.SpringSecuritySample.repository;

import com.example.SpringSecuritySample.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByEmail(String email);


    Customer findById(int id);
}
