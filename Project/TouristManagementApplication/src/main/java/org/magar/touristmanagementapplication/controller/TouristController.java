package org.magar.touristmanagementapplication.controller;

import org.magar.touristmanagementapplication.model.Tourist;
import org.magar.touristmanagementapplication.service.ITouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouristController
{
    @Autowired
    private ITouristService service;

    //API for register the Tourist info
    @PostMapping("/register")
    public ResponseEntity<String> addTouristInfo( @RequestBody Tourist tourist)
    {
        String status = service.registerTourist(tourist);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    //API for fetching the Tourist info through id
    @GetMapping("/getTourist/{id}")
    public ResponseEntity<?> getTouristInfo(@PathVariable Integer id)
    {
        Tourist tourist = service.getTouristById(id);
        return new ResponseEntity<>(tourist, HttpStatus.OK);
    }

    //API for fetching all the tourist info
    @GetMapping("/getAllTourist")
    public ResponseEntity<?> getAllTouristInfo()
    {
        List<Tourist> tourists = service.fetchAllTourists();
        return new ResponseEntity<>(tourists, HttpStatus.OK);
    }

    //API for to update the Tourist info
    @PutMapping("/updateTourist")
    public ResponseEntity<?> updateTouristInfo(@RequestBody Tourist tourist)
    {
        String status = service.updateTouristData(tourist);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    //API for to update the Tourist info through id
    @PatchMapping("/updateinfo/{id}/{price}")
    public ResponseEntity<?> updateTouristInfoById(@PathVariable Integer id, @PathVariable Double price)
    {
        String status = service.updateTouristDataById(id, price);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    //API for to delete the Tourist info through id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTouristInfo(@PathVariable Integer id)
    {
        String status = service.deleteTouristById(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
