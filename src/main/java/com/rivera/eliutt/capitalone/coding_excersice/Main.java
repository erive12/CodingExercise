package com.rivera.eliutt.capitalone.coding_excersice;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.rivera.eliutt.capitalone.coding_excersice.authentication.CommonArgumentFields;
import com.rivera.eliutt.capitalone.coding_excersice.transactions.Money;
import com.rivera.eliutt.capitalone.coding_excersice.transactions.Output;
import com.rivera.eliutt.capitalone.coding_excersice.transactions.Transaction;
import com.rivera.eliutt.capitalone.coding_excersice.transactions.TransactionsClient;

public class Main {
	
	public static void main(String[] args) {
		
		final Integer uid = 1110590645;
		final String token = "A6AD403C378DEBCFDC6888920CADFBC9";
		final String apiToken = "AppTokenForInterview";
		Boolean ignoreDonutEnabled = false;
		
		if(args.length > 0){
			ignoreDonutEnabled = true;
		}
		
		CommonArgumentFields commonArgumentFields = new CommonArgumentFields();
		commonArgumentFields.setUid(uid);
		commonArgumentFields.setToken(token);
		commonArgumentFields.setApiToken(apiToken);
		
		TransactionsClient transactionsClient = new TransactionsClient();
		List<Transaction> transactions = transactionsClient.getTransactions(commonArgumentFields);
		
		ArrayList<Output> outputList = getUsersMonthlyReport(transactions, ignoreDonutEnabled);
		
		displayReport(outputList);
		
	}
	
	public static ArrayList<Output> getUsersMonthlyReport(List<Transaction> transactions, Boolean ignoreDonutEnabled){
		String date = transactions.get(0).getTransactionTime().substring(0,7);
		Long spent = 0L;
		Long income = 0L;
		ArrayList<Output> outputList = new ArrayList<>();
		
		for(int i = 0; i < transactions.size(); i++){
			Output output = new Output();
			Money money = new Money();
			if(ignoreDonutEnabled && (transactions.get(i).getMerchant().equals("Krispy Kreme Donuts") || transactions.get(i).getMerchant().equals("Krispy Kreme Donuts"))){
				continue;
			}
			else if(date.equals(transactions.get(i).getTransactionTime().substring(0,7))){
				if (transactions.get(i).getAmount() < 0) {
					spent +=  transactions.get(i).getAmount();
					
				} else {
					income +=  transactions.get(i).getAmount();
				}
			}
			else{
				output.setDate(date);
				money.setSpent(spent);
				money.setIncome(income);
				output.setMoney(money);
				outputList.add(output);
				date = transactions.get(i).getTransactionTime().substring(0,7);
				spent = 0L;
				income = 0L;
				if (transactions.get(i).getAmount() < 0) {
					spent =  transactions.get(i).getAmount();
					
				} else {
					income = transactions.get(i).getAmount();
				}
			}
		}
		return outputList;
	}
	
	public static void displayReport(ArrayList<Output> outputList){
		Gson gson = new Gson();
		System.out.println("----------------------User Report Start----------------------------------");
		Long sumSpent = 0L;
		Long sumIncome = 0L;
		Long avgSpent = 0L;
		Long avgIncome = 0L;
		Integer count = 0;
		for(int i = 0; i< outputList.size(); i++){
			sumSpent += outputList.get(i).getMoney().getSpent();
			sumIncome += outputList.get(i).getMoney().getIncome();
			count++;
			System.out.println(gson.toJson(outputList.get(i)));
		}
		avgSpent = sumSpent/count;
		avgIncome = sumIncome/count;
		System.out.println("average: " + "spent: " + avgSpent + " income: " + avgIncome);
		System.out.println("----------------------User Report End------------------------------------");
	}

}
