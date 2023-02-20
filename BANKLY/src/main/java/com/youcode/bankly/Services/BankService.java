package com.youcode.bankly.Services;

import com.youcode.bankly.Entitty.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService {
    List<Bank>BANK_LIST();
    Bank addBank(Bank bank);
    Optional<Bank> getBankById(String id);
    Bank updateBank(Bank bank);
    void deleteBank(String id);
}
