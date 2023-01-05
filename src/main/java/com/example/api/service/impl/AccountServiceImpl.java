package com.example.api.service.impl;

import com.example.api.entity.Account;
import com.example.api.entity.Role;
import com.example.api.repository.AccountRepository;
import com.example.api.repository.RoleRepository;
import com.example.api.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder encoder;

    @Override
    public Account createAccount(Account account) {
        account.setPassword(encoder.encode(account.getPassword()));
        Role role = roleRepository.findByName("ROLE_USER");
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        account.setRoles(roles);
        return accountRepository.save(account);
    }

    @Override
    public Account findByUserName(String userName) {
        return accountRepository.findByUserName(userName);
    }

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }
}
