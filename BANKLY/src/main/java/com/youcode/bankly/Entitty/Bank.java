package com.youcode.bankly.Entitty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Bank {
    @Id
    private long id;
    private String name;
    private List<Compte> comptes = new ArrayList<>();

}
