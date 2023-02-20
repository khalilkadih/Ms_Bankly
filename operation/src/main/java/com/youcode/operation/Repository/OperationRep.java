package com.youcode.operation.Repository;

import com.youcode.operation.Entitty.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRep extends JpaRepository<Operation, String> {
}
