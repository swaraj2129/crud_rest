package com.myapp.user;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.myapp.account.Account;

@Entity
public class User {

@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int userId; 	
public String name;
//public Account account;

@JsonManagedReference
@OneToMany(fetch=FetchType.LAZY,mappedBy = "user",cascade = CascadeType.ALL)
private List<Account> accounts;
public User() {
	
}







public int getUserId() {
	return userId;
}







public void setUserId(int userId) {
	this.userId = userId;
}







public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

//public User(int id, String name) {
//	super();
//	this.Uid = id;
//	this.name = name;
//}

public List<Account> getAccounts() {
	return accounts;
}
public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
}



}
