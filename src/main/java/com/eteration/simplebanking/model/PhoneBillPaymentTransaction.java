package com.eteration.simplebanking.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Component
public class PhoneBillPaymentTransaction extends BillPaymentTransaction {

    private String billBrand;
    private String phoneNumber;

    public PhoneBillPaymentTransaction(String billBrand, String phoneNumber, Double amount) {
        super(amount);
        this.billBrand = billBrand;
        this.phoneNumber = phoneNumber;
        setAmount(amount);
        setDate(LocalDateTime.now());
        setType("PhoneBillPaymentTransaction");
    }
}
