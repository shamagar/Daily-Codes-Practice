package org.magar.customermanagementwebapp.service;

import org.magar.customermanagementwebapp.model.Customer;
import org.magar.customermanagementwebapp.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService
{
    private CustomerRepo repo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo repo)
    {
        this.repo = repo;
    }

    //Method to register the customer and save into the database
    @Override
    public void registerCustomer(Customer customer)
    {
        repo.save(customer);
        System.out.println("Customer registered successfully");

    }

    //Display the list of all customer
    @Override
    public List<Customer> getCustomersInfo() {
        return (List<Customer>) repo.findAll();
    }

    //Delete the record by id
    @Override
    public void deleteCustomer(Integer id) {
        repo.deleteById(id);
    }
}
