package org.magar.customermanagementwebapp.controller;

import org.magar.customermanagementwebapp.model.Customer;
import org.magar.customermanagementwebapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class CustomerController
{
    private CustomerService service;

    @Autowired
    public CustomerController (CustomerService service)
    {
        this.service = service;
    }

    //For Registration page
    @GetMapping("/registrationCustomer")
    public String registerCustomer(@ModelAttribute("customer")Customer customer)
    {
        service.registerCustomer(customer);
        return "redirect:/customerlist";
    }

    //Show the data
    @GetMapping("/showform")
    public String showForm(@ModelAttribute("customer") Customer customer)
    {
        return "showform";
    }

    //Fetch all the data from the database
    @GetMapping("/customerlist")
    public String getAllCustomerData(Model model)
    {
        List<Customer> customerList = service.getCustomersInfo();
        model.addAttribute("customers", customerList);
        return "customerlist";
    }

    //Update the existing data
    @GetMapping("/updateForm")
    public String updateForm(@ModelAttribute("customer") Customer customer)
    {
        return "update";
    }

//	@PutMapping("/updateCustomer")
//	public String updateCustomer(@ModelAttribute("customer")Customers customer)
//	{
//		service.registerCustomer(customer);
//		System.out.println("redirect");
//		return "redirect:/customerlist";
//	}

    //Deleting the existing data
    @GetMapping("/deleteData")
    public String deleteCustomer(@RequestParam Integer cid)
    {
        service.deleteCustomer(cid);
        return "redirect:/customerlist";
    }
}
