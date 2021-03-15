package com.myapp.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/accounts")
	public List<Account> gT() {
		
		return accountService.getAllAccounts();
	}
	@RequestMapping("/users/{id}/accounts")
	public List<Account> getAllAccounts(@PathVariable String id) {
		
		return accountService.getAllAccounts(Integer.valueOf(id));
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/accounts")
	public void addAccount(@RequestBody Account account) {
		accountService.addAccount(account);
	}
}