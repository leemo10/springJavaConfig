package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by leemorris on 25/08/2016.
 */

public class CustomerServiceImpl implements CustomerService {


    //@Autowired
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();



    public CustomerServiceImpl(){

    }


    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
