package com.pluralsight;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leemorris on 13/09/2016.
 */
@Configuration
public class AppConfig {

    @Bean(name="customerService")
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService =  new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
    }

    @Bean(name="customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }

}
