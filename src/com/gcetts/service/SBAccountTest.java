package com.gcetts.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gcetts.bean.SBAccount;

public class SBAccountTest {
	private SBAccount sbAccount = new SBAccount();
	
	@Test
	public void getSetAmountTest() {
		sbAccount.setAmount(10000.0);
		assertEquals(10000.0, sbAccount.getAmount(), 0.0);
	}
	
	@Test
	public void getSetInterestTest() {
		sbAccount.setInterestRate(5);
		assertEquals(5, sbAccount.getInterestRate(), 0);
	}

	@Test
	public void calculateInterestTest() {
		sbAccount.setAmount(10000.0);
		assertEquals(400.0, sbAccount.calculateInterest(), 0.0);
	}

}
