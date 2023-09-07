package com.eteration.simplebanking.entity;

import com.eteration.simplebanking.model.Transaction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "account_number")
    private String accountNumber;

    private String owner;
    private Double balance;

    @OneToMany
    private List<Transaction> transactions;

    public Account(String owner, String accountNumber, Double balance, List<Transaction> transactions) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransaction() {
        return transactions;
    }

    public void setTransaction(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
