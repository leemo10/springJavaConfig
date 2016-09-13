package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by leemorris on 25/08/2016.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
