package com.myapp.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account,Integer> {

public List<Account> findByUserUserId(Integer id);
}
