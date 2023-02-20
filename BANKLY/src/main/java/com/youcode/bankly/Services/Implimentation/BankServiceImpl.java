package com.youcode.bankly.Services.Implimentation;

import com.youcode.bankly.Entitty.Bank;
import com.youcode.bankly.Repository.BankRepo;
import com.youcode.bankly.Services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {
   @Autowired
   BankRepo bankRepo;



    @Override
    public List<Bank> BANK_LIST() {
        return bankRepo.findAll();
    }

    @Override
    public Bank addBank(Bank bank) {
        return bankRepo.save(bank);
    }

    @Override
    public Optional<Bank> getBankById(String id) {
        return bankRepo.findById(id);
    }

    @Override
    public Bank updateBank(Bank bank) {
        return bankRepo.save(bank);
    }

    @Override
    public void deleteBank(String id) {
    bankRepo.deleteById(id);
    }
}
