package org.magar.customermanagementwebapp.service;

import org.magar.customermanagementwebapp.model.Customer;

import java.util.List;

public interface CustomerService
{
    void registerCustomer(Customer customer);
    List<Customer> getCustomersInfo();
    void deleteCustomer(Integer id);

}
