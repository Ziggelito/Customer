package com.example.customer;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Embeddable
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    protected long id;
    protected String name;
    protected String personNr;

    public Customer(String name, String personNr) {
        this.name = name;
        this.personNr = personNr;
    }

}

