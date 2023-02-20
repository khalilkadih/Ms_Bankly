package com.youcode.operation.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compte {
    private String id;
    private String proprietaire;
    private Double Solde ;
}
