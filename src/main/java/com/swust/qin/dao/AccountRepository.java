package com.swust.qin.dao;

import com.swust.qin.po.Account;
import com.swust.qin.po.AccountId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,AccountId>{
}
