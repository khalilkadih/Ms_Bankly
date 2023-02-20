package com.youcode.operation.Services;

import com.youcode.operation.Entitty.Operation;
import org.springframework.stereotype.Service;

@Service
public interface OperationService {
  Operation deposerArgent(Operation operation);
  Operation retirerArgent(Operation operation);
/*
  Double SoldeCompte(String idCompte);
*/
}
