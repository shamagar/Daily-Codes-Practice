package org.magar.customermanagementwebapp.repo;

import org.magar.customermanagementwebapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>
{
}
