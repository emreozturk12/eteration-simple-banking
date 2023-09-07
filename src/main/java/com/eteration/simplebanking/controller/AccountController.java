package com.eteration.simplebanking.controller;

import com.eteration.simplebanking.entity.Account;
import com.eteration.simplebanking.services.AccountService;
import com.eteration.simplebanking.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.SqlResultSetMapping;

@Controller
@RequestMapping("account")
public class AccountController {

    private AccountService accountService;
    private TransactionService transactionService;

    public AccountController(AccountService accountService, TransactionService transactionService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
    }

    @PostMapping(name = "/v1/credit/{id}", produces = "application/json")
    public ResponseEntity<String> creditAmount(Double amount, @PathVariable String id) {
        if (accountService.creditBalance(amount, id) == 1) {
            transactionService.saveTransaction(id, amount);
            return new ResponseEntity<>("Increasing amount is successful", HttpStatus.OK);
        }
        return new ResponseEntity<>("Increasing amount is failed", HttpStatus.BAD_REQUEST);
    }

    @PostMapping(name = "/v1/debit/{id}", produces = "application/json")
    public ResponseEntity<String> debitAmount(Double amount, @PathVariable String id) {
        if (accountService.debitBalance(amount, id) == 1) {
            transactionService.saveTransaction(id, amount);
            return new ResponseEntity<>("Decreasing amount is successful", HttpStatus.OK);
        }
        return new ResponseEntity<>("Decreasing amount is failed", HttpStatus.BAD_REQUEST);
    }

    @GetMapping(name = "/v1/{id}", produces = "application/json")
    public SqlResultSetMapping getAccount(@PathVariable String id) {
        return accountService.getAccountInfo(id);
    }
    /*public void post(Transaction transaction) {
        accountService.saveAccount(transaction);
	}*/
}