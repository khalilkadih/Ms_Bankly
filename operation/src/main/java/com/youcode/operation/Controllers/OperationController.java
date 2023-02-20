package com.youcode.operation.Controllers;

import com.youcode.operation.Entitty.Operation;
import com.youcode.operation.Services.Implimentation.OperationServiceImpl;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/api/v1/operation")
public class OperationController {

    private final OperationServiceImpl operationService;

    public OperationController(OperationServiceImpl operationService) {
        this.operationService = operationService;
    }


    @PostMapping("/Mettre")
    public Operation mettreSolde(@RequestBody Operation operation){
        return operationService.deposerArgent(operation);
    }

    @PostMapping("/retirer")
    public Operation retirer(@RequestBody Operation operation){
        return operationService.retirerArgent(operation);
    }


   /* @GetMapping("/SoldeCompte/{id}")
    public Double mettreSolde(@PathVariable("id") String id){
        return operationService.SoldeCompte(id);
    }*/

}

