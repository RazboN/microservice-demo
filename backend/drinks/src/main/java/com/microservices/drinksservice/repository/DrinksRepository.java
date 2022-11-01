package com.microservices.drinksservice.repository;

import com.microservices.drinksservice.entity.Drink;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DrinksRepository extends MongoRepository<Drink, String> {
    Drink findByName(String name);
}
