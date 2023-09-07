package com.eteration.simplebanking.services;

import com.eteration.simplebanking.entity.Transaction;
import com.eteration.simplebanking.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction saveTransaction(String accountNumber, Double amount) {
        return transactionRepository.save(new Transaction(accountNumber, LocalDateTime.now(), amount));
    }


}
