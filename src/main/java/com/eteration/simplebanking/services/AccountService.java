package com.eteration.simplebanking.services;


import com.eteration.simplebanking.entity.Account;
import com.eteration.simplebanking.repository.AccountRepository;
import org.springframework.stereotype.Service;

import javax.persistence.SqlResultSetMapping;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public SqlResultSetMapping getAccountInfo(String accountNumber) {
        return accountRepository.findAccountWithTransactions(accountNumber);
    }
    public int creditBalance(Double balance, String accountNumber) {
        return accountRepository.creditBalance(balance, accountNumber);
    }
    public int debitBalance(Double balance, String accountNumber) {
        return accountRepository.debitBalance(balance, accountNumber);
    }
    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

}
