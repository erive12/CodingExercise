package com.rivera.eliutt.capitalone.coding_excersice.transactions;

import java.util.List;

public class TransactionResponse {
	private String error;
	private List<Transaction> transactions;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
}
