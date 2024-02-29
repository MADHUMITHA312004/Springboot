package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo rep;

    @SuppressWarnings("null")
    public boolean post(Customer person) {
        try {
            rep.save(person);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Customer> getAllCustomerbyCity(String city) {
        return rep.findByCity(city);
    }

    public List<Customer> getAllCustomer() {
        return rep.findAll();
    }

    public Customer getAllCustomerById(int id)
    {
        return rep.findAllCustomerId(id);
    }

    public Customer updaCustomerPincode(int customerId, int pinCode) {
        return rep.updateCustomer(customerId, pinCode);
    }

    public void deleteByCustomerID(int customerId) {
         rep.delete(customerId);
    }

    

}
