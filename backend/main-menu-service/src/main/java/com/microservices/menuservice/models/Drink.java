package com.microservices.menuservice.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class Drink {
    private String id;
    private String name;
    private int price;
}
