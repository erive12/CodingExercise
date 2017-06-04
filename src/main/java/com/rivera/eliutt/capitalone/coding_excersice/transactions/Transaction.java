package com.rivera.eliutt.capitalone.coding_excersice.transactions;

import com.google.gson.annotations.SerializedName;

public class Transaction {
	private Long amount;
	@SerializedName("is-pending")
	private Boolean isPending;
	@SerializedName("aggregation-time")
	private long aggregationTime;
	@SerializedName("account-id")
	private String accountId;
	@SerializedName("clear-date")
	private long clearDate;
	@SerializedName("transaction-id")
	private String transactionId;
	private String categorization;
	@SerializedName("raw-merchant")
	private String merchant;
	@SerializedName("transaction-time")
	private String transactionTime;
	
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getCategorization() {
		return categorization;
	}
	public void setCategorization(String categorization) {
		this.categorization = categorization;
	}
	public Boolean getIsPending() {
		return isPending;
	}
	public void setIsPending(Boolean isPending) {
		this.isPending = isPending;
	}
	public long getAggregationTime() {
		return aggregationTime;
	}
	public void setAggregationTime(long aggregationTime) {
		this.aggregationTime = aggregationTime;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public long getClearDate() {
		return clearDate;
	}
	public void setClearDate(long clearDate) {
		this.clearDate = clearDate;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
}
