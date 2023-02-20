package com.youcode.operation.exception;

public class SoldeInsufisant extends RuntimeException{

    public SoldeInsufisant() {
        super("Votre solde n'est pas suffucant pour cette operation ");
    }
}
