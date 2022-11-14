package com.microservices.menuservice.controller;

import com.microservices.menuservice.models.Drink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/menu/drinks")
public class MenuController {
    @Autowired
    private RestTemplate _restTemplate;

    private final String DRINKSMENU = "drinks_menu";

    @GetMapping
	public void getAllMenuItems(){

	}

	@GetMapping
    @Cacheable(DRINKSMENU)
	public List<Drink> getDrinksMenu(){
        try{
            ResponseEntity<List<Drink>> responseEntity =
                    _restTemplate.exchange(
                            "http://drinks-menu-service/drinksMenu",
                            HttpMethod.GET,
                            null,
                            new ParameterizedTypeReference<List<Drink>>() {}
                    );

            log.info("drinksMenu - {}", responseEntity.getBody());
            return responseEntity.getBody();
        }
        catch (Exception ex){
            log.error(ex.getMessage());
            return null;
        }
	}

    @PostMapping
    @CachePut(DRINKSMENU)
    public Drink addMenuItem(@RequestBody Drink newItem){
        try {
            ResponseEntity<Drink> savedItem =
                _restTemplate.postForObject(
                        "http://drinks-menu-service/drinksMenu",
                        newItem,
                        ResponseEntity.class);

            return savedItem.getBody();
        }
        catch (Exception ex){
            log.error("Error during savin {}", ex.getMessage());
            return null;
        }
    }
}
