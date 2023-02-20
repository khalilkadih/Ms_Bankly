package com.youcode.operation.Services.Implimentation;

import com.youcode.operation.Entitty.Operation;
import com.youcode.operation.Entitty.OperationType;
import com.youcode.operation.Repository.OperationRep;
import com.youcode.operation.Services.OperationService;
import com.youcode.operation.bean.Compte;
import com.youcode.operation.exception.SoldeInsufisant;
import com.youcode.operation.proxie.MicroserviceClientProxy;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
    private final OperationRep operationRep;
    private final MicroserviceClientProxy microserviceClientProxy;


    public OperationServiceImpl(OperationRep operationRep, MicroserviceClientProxy microserviceClientProxy) {
        this.operationRep = operationRep;

        this.microserviceClientProxy = microserviceClientProxy;
    }


    @Override
    public Operation retirerArgent(Operation operation) {
        Operation deposer = new Operation();
        deposer.setCompteId(operation.getCompteId());
        deposer.setOperationType(OperationType.Retirer);
        deposer.setSolde(operation.getSolde());
        Compte compte=microserviceClientProxy.getCompteById(operation.getCompteId());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(compte.toString());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        if (compte.getSolde() > deposer.getSolde()) {
            return operationRep.save(operation);
        }
        else  throw new SoldeInsufisant();
    }

 /*   @Override
    public Double SoldeCompte(String idCompte) {
        double somme=0;
        while ( microserviceClientProxy.getCompteById(idCompte)!=null){
            somme=microserviceClientProxy.getCompteById(idCompte).getSolde();

        }
        return somme;
    }*/


    @Override
    public Operation deposerArgent(Operation operation) {

      /*  Compte retirer = microserviceClientProxy.getCompteById(operation.getCompteId());
        if (retirer.equals(null)){
            //TODO
            //Create new Compte
        }else*/

        Operation retirer = new Operation();
        retirer.setOperationType(OperationType.Mettre);
        retirer.setCompteId(operation.getCompteId());
        double soldeDeposer=microserviceClientProxy.getCompteById(operation.getCompteId()).getSolde()+operation.getSolde();
        retirer.setSolde(soldeDeposer);
        return operationRep.save(retirer);
    }


}
