package com.eteration.simplebanking.model;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class BillPaymentTransaction extends Transaction {

    public BillPaymentTransaction(Double amount) {
        setAmount(amount);
        setDate(LocalDateTime.now());
        setType("BillPaymentTransaction");
    }
}
