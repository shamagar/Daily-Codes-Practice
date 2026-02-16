package org.magar.touristmanagementapplication.dao;

import org.magar.touristmanagementapplication.model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITouristRepo extends JpaRepository<Tourist, Integer>
{

}
