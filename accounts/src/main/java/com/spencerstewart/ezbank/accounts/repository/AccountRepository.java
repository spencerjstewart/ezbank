package com.spencerstewart.ezbank.accounts.repository;

import com.spencerstewart.ezbank.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {}
