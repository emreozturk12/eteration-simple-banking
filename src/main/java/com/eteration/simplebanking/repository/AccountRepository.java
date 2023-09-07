package com.eteration.simplebanking.repository;

import com.eteration.simplebanking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.SqlResultSetMapping;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

    @Query("SELECT * " +
            "FROM account a " +
            "LEFT JOIN transaction t ON a.account_number = t.account_number " +
            "WHERE a.account_number = :accountNumber " +
            "GROUP BY ")
    SqlResultSetMapping findAccountWithTransactions(String accountNumber);

    @Query("UPDATE account SET balance = balance + :balance WHERE accountNumber = :accountNumber")
    int creditBalance(Double balance, String accountNumber);

    @Query("UPDATE account SET balance = balance - :balance WHERE accountNumber = :accountNumber")
    int debitBalance(Double balance, String accountNumber);
}
