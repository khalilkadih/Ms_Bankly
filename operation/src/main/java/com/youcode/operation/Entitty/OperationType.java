package com.youcode.operation.Entitty;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public enum OperationType {

/*
    Mettre,Retirer
*/

    Mettre("mettre"),
    Retirer("Retirer");
    private String typeOperation;

    OperationType(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }
}
