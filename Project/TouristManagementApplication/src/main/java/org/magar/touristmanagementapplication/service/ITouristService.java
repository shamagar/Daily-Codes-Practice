package org.magar.touristmanagementapplication.service;

import org.magar.touristmanagementapplication.model.Tourist;

import java.util.List;

public interface ITouristService
{
    String registerTourist(Tourist tourist);
    Tourist getTouristById(Integer id);
    List<Tourist> fetchAllTourists();
    String updateTouristData(Tourist tourist);
    String updateTouristDataById(Integer id, Double price);
    String deleteTouristById(Integer id);
}
