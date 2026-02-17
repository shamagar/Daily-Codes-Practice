package org.magar.touristmanagementapplication.service;

import org.magar.touristmanagementapplication.dao.ITouristRepo;
import org.magar.touristmanagementapplication.exception.TouristNotFoundException;
import org.magar.touristmanagementapplication.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristServiceImpl implements ITouristService
{
    @Autowired
    private ITouristRepo touristRepo;

    //Method to register the Tourist info
    @Override
    public String registerTourist(Tourist tourist)
    {
        Tourist t = touristRepo.save(tourist);
        Integer id = t.getId();
        return "Tourist registered successfully with id: " + id;
    }

    //Method to display the Tourist's Info through id
    @Override
    public Tourist getTouristById(Integer id)
    {
        //First Method
        /*
        Optional<Tourist> optional = touristRepo.findById(id);
        if(optional.isPresent())
        {
            return optional.get();
        }
        return null;
         */

        //Second Method
        return touristRepo.findById(id).
                orElseThrow(null);
    }

    //Method to display the all Tourist's Info
    @Override
    public List<Tourist> fetchAllTourists()
    {
        List<Tourist> touristList = touristRepo.findAll();
        return touristList;
    }

    //Method to update the Tourist data using Tourist object
    @Override
    public String updateTouristData(Tourist tourist)
    {
        //Get the Tourist id to update
        Optional<Tourist> optional = touristRepo.findById(tourist.getId());
        if(optional.isPresent())
        {
            touristRepo.save(tourist);
            return "Tourist data updated successfully with id: " + tourist.getId();
        }
        else
        {
            throw new TouristNotFoundException("Tourist not found with id: " + tourist.getId());
        }
    }

    //Method to update the price of Tourist data using Tourist id
    @Override
    public String updateTouristDataById(Integer id, Double price)
    {
        Optional<Tourist> optional = touristRepo.findById(id);
        if(optional.isPresent())
        {
            Tourist t = optional.get();
            t.setPrice(price);
            touristRepo.save(t);
            return "Tourist data updated successfully with id: " + id;
        }
        else
        {
            throw new TouristNotFoundException("Tourist not found with id: " + id);
        }

    }



    //Method to delete the Tourist data using Tourist id
    @Override
    public String deleteTouristById(Integer id)
    {
        Optional<Tourist> optional = touristRepo.findById(id);
        if(optional.isPresent())
        {
            touristRepo.deleteById(id);
            return "Tourist data deleted successfully with id: " + id;
        }
        else
        {
            throw new TouristNotFoundException("Tourist not found with id: " + id);
        }
    }
}
