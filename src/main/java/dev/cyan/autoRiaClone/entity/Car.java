package dev.cyan.autoRiaClone.entity;

import dev.cyan.autoRiaClone.enums.Currency;
import dev.cyan.autoRiaClone.enums.Status;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@Document("cars")
public class Car {
    @MongoId
    private String id;
    private String brand;
    private String model;
    private int year;
    private int power;
    private int price;
    private Currency currency;
    private Status status = Status.ACTIVE;
    private String userId;
}
