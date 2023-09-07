package com.eteration.simplebanking.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transaction")
public class Transaction {

    @OneToOne
    @JoinColumn(name = "account_number")
    public String accountNumber;

    public LocalDateTime date;
    public Double amount;
    public UUID approvalCode;
    public String type;

    public Transaction(String accountNumber, LocalDateTime date, Double amount, UUID approvalCode, String type) {
        this.accountNumber = accountNumber;
        this.date = date;
        this.amount = amount;
        this.approvalCode = approvalCode;
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public UUID getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(UUID approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
