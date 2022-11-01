package com.microservices.drinksservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
@Document(collection = "Drink")
public class Drink {
    @Id
    private String id;
    private String name;
    private int price;
}
