package com.eteration.simplebanking.model;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class DepositTransaction extends Transaction {

    public DepositTransaction(Double amount) {
        setAmount(amount);
        setDate(LocalDateTime.now());
        setType("DepositTransaction");
    }
}
