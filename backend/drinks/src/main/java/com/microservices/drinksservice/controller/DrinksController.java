package com.microservices.drinksservice.controller;

import com.microservices.drinksservice.entity.Drink;
import com.microservices.drinksservice.service.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/drinksMenu")
public class DrinksController {
    @Autowired
    private DrinksService _service;

    @GetMapping
    public List<Drink> getDrinksMenu() throws Exception {
        try{
            return _service.GetDrinksMenu();
        }
        catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @PostMapping
    public Drink addDrinkToMenu(@RequestBody Drink reqObj) throws Exception {
        try{
            return _service.AddDrinkToMenu(reqObj);
        }
        catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
