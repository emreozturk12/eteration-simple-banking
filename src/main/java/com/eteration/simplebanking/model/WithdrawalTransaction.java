package com.eteration.simplebanking.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class WithdrawalTransaction extends Transaction {

    public WithdrawalTransaction(Double amount) {
        setAmount(amount);
        setDate(LocalDateTime.now());
        setType("WithdrawalTransaction");
    }
}


