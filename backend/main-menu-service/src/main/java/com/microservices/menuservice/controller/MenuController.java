package com.microservices.menuservice.controller;

import com.microservices.menuservice.models.Drink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
    RestTemplate _restTemplate;

    @GetMapping
	public void getAllMenuItems(){

	}

	@GetMapping("/drinks")
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
        }
        return null;
	}
}
