package com.microservices.drinksservice.service;

import com.microservices.drinksservice.Helpers;
import com.microservices.drinksservice.entity.Drink;
import com.microservices.drinksservice.repository.DrinksRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class DrinksService {
    @Autowired
    private DrinksRepository _repo;

    @Autowired
    private Helpers _helpers;

    public List<Drink> GetDrinksMenu(){
        log.info("GetDrinksMenu");
        return _repo.findAll();
    }

    @Transactional
    public Drink AddDrinkToMenu(Drink paramObj) throws Exception {
        if(_helpers.isNewItemExists(paramObj.getName())) {
            log.error(String.valueOf(HttpStatus.CONFLICT));
            throw new Exception(String.valueOf(HttpStatus.CONFLICT));
        }

        String id = "";
        do{
            id = UUID.randomUUID().toString();
        }while(_helpers.isIdUnique(id) == false);

        paramObj.setId(id);
        log.info("AddDrinkToMenu: {}", paramObj);
        return _repo.save(paramObj);
    }
}
