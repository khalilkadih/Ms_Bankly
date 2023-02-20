package com.youcode.operation.Entitty;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.Transaction;

import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long referenceOPeration;
    private Double solde;
    @Enumerated(EnumType.STRING)
    private OperationType operationType;
    private String compteId;


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || Hibernate.getClass(this) != Hibernate.getClass(object)) return false;
        Operation operation = (Operation) object;
        return compteId != null && Objects.equals(compteId, operation.compteId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
