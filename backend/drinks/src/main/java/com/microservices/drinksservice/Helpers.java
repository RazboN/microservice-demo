package com.microservices.drinksservice;

import com.microservices.drinksservice.entity.Drink;
import com.microservices.drinksservice.repository.DrinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Helpers {
    @Autowired
    private DrinksRepository _repo;
    public boolean isIdUnique(String newId) {
        long retVal = _repo.findById(newId).stream().count();
        if(retVal > 0)
            return false;

        return true;
    }
    public boolean isNewItemExists(String name){
        Drink retVal = _repo.findByName(name);

        if(null != retVal)
            return true;

        return false;
    }
}
