package com.youcode.bankly.Services.Implimentation;

import com.youcode.bankly.Entitty.Compte;
import com.youcode.bankly.Repository.CompteRepository;
import com.youcode.bankly.Services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteServiceImpl implements CompteService {
   @Autowired
    CompteRepository compteRepo;

    @Override
    public List<Compte> COMPTES() {
        return compteRepo.findAll() ;
    }

    @Override
    public Compte addCompte(Compte compte) {
        Compte newCompte= new Compte();
        newCompte.setProprietaire(compte.getProprietaire());
        newCompte.setSolde(compte.getSolde());
        return compteRepo.save(newCompte);
    }

    @Override
    public Compte updateCompte(Compte compte) {
        return compteRepo.save(compte);
    }

    @Override
    public void deletCompte(String id) {

        compteRepo.deleteById(id);
    }

    @Override
    public Optional<Compte> findCompteById(String id) {
         return compteRepo.findById(id);

    }
    @Override
    public Compte findCompteByPrprietaire(String name) {
        return compteRepo.findCompteByProprietaire(name);
    }
}
