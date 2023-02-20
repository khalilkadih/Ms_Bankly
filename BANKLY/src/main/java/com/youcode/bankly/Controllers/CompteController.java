package com.youcode.bankly.Controllers;

import com.youcode.bankly.Entitty.Compte;
import com.youcode.bankly.Services.Implimentation.CompteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CompteController {

    @Autowired
     CompteServiceImpl compteService;

    public CompteController(CompteServiceImpl compteService) {
        this.compteService = compteService;
    }

    @GetMapping(value = "/compte")
    public List<Compte> comptes(Compte compte){
        return compteService.COMPTES();
    }
    @PostMapping("/addCompte")
    public Compte addcompte(Compte compte){
        return compteService.addCompte(compte);
    }
    @GetMapping(value = "/compte/{id}")
    public Optional<Compte> findById(@PathVariable("id") String id){
        return compteService.findCompteById(id);
    }
}
