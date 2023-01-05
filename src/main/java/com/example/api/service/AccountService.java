package com.example.api.service;

import com.example.api.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    Account createAccount(Account account);

    Account findByUserName(String userName);

    List<Account> getAccounts();
}
