package com.gcetts.bean;

abstract class Account {
	double interestRate;
	double amount;
	
	abstract double calculateInterest();
}
