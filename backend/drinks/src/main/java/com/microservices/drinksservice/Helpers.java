package com.microservices.drinksservice;

import com.microservices.drinksservice.entity.Drink;
import com.microservices.drinksservice.repository.DrinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Helpers {
    @Autowired
    private DrinksRepository _repo;

    /**
     * Spring Boot does not support autogenerate id for primary key of the mongodb document.
     * That's why we need to check whether new id exists or not manually
     * */
    public boolean isIdUnique(String newId) {
        long retVal = _repo.findById(newId).stream().count();
        if(retVal > 0)
            return false;

        return true;
    }

    /**
     * The product to be added may have already been added also.
     * This should also be checked.
     * Custom repository implementation was added for this operation -findByName()-
     * */
    public boolean isNewItemExists(String name){
        Drink retVal = _repo.findByName(name);

        if(null != retVal)
            return true;

        return false;
    }
}
