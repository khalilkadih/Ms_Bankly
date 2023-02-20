package com.youcode.bankly;


import com.youcode.bankly.Entitty.Compte;
import com.youcode.bankly.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class BanklyApplication implements CommandLineRunner {
    @Autowired
    CompteRepository compteRepository;
    public static void main(String[] args) {
        SpringApplication.run(BanklyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
/*
        compteRepository.save(new Compte(null,"khalil",100000d));
*/
    }
}
