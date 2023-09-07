package com.eteration.simplebanking.model;

import org.springframework.stereotype.Component;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Component
public class CheckTransaction extends Transaction {

    public CheckTransaction(Double amount) {
        setAmount(amount);
        setDate(LocalDateTime.now());
        setType("CheckTransaction");
    }
}
