package com.eteration.simplebanking.model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Transaction {

    public LocalDateTime date;
    public Double amount;
    public UUID approvalCode;
    public String type;

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setApprovalCode(UUID approvalCode) {
        this.approvalCode = approvalCode;
    }

    public void setType(String type) {
        this.type = type;
    }

}
