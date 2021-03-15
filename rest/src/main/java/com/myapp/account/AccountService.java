package com.myapp.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	
	@Autowired
	private AccountRepository accountRepository;

	public List<Account> getAllAccounts(){
		List<Account> accounts = new ArrayList<>();
		
		accountRepository.findAll().forEach(accounts::add);
		return accounts;
	}
	public List<Account> getAllAccounts(Integer id){
		List<Account> accounts = new ArrayList<>();
		
		accountRepository.findByUserUserId(id).forEach(accounts::add);
		return accounts;
		//accountRepository.findByUserId(id);
	}
	public void addAccount(Account account) {
		accountRepository.save(account);
	}
}
