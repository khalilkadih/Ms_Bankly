package com.youcode.bankly.Repository;

import com.youcode.bankly.Entitty.Compte;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends MongoRepository<Compte,String> {
    Compte findCompteByProprietaire(String name);
}
