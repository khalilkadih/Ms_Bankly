package com.youcode.bankly.Repository;

import com.youcode.bankly.Entitty.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends MongoRepository<Bank,String> {
}
