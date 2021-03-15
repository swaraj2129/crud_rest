package com.myapp.account;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.myapp.user.User;

@Entity
public class Account {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int aId;
String accountNumber;
float balance;


@ManyToOne
@JoinColumn(name="USER_ID")
@JsonBackReference
public User user;

public Account() {
	
}


public int getaId() {
	return aId;	
}



public void setaId(int aId) {
	this.aId = aId;
}








public String getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}


public float getBalance() {
	return balance;
}


public void setBalance(float balance) {
	this.balance = balance;
}

public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}


//public Account(int id, String accountNumber, float balance, User user) {
//	super();
//	this.Aid = id;
//	this.accountNumber = accountNumber;
//	this.balance = balance;
//	this.user = user;
//}



}
