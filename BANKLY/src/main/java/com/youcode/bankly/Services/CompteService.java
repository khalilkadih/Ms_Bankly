package com.youcode.bankly.Services;

import com.youcode.bankly.Entitty.Compte;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface CompteService {
    List<Compte> COMPTES();
    Compte addCompte( Compte compte);
    Compte updateCompte(Compte compte);
    void deletCompte(String id);
    Optional<Compte> findCompteById(String id);
    Compte findCompteByPrprietaire(String name);

}
