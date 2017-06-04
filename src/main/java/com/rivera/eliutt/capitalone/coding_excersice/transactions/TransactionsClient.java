/**
 * 
 */
package com.rivera.eliutt.capitalone.coding_excersice.transactions;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.rivera.eliutt.capitalone.coding_excersice.authentication.Arguments;
import com.rivera.eliutt.capitalone.coding_excersice.authentication.CommonArgumentFields;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * @author Eliutt
 *
 */


public class TransactionsClient {
	
	public List<Transaction> getTransactions(CommonArgumentFields commonArgumentFields){
		Arguments argument = new Arguments();
		argument.setArgs(commonArgumentFields);
		
		Gson gson = new Gson();
        Object transactionsPayload = gson.toJson(argument);
        
		ClientResponse response = null;
		Client client = Client.create();
		WebResource resource = client.resource("https://2016.api.levelmoney.com/api/v2/core/get-all-transactions");
		
		response = resource.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, transactionsPayload);
		
		TransactionResponse res = gson.fromJson(response.getEntity(String.class), TransactionResponse.class);
		List<Transaction> transactions = res.getTransactions();
		
		return transactions;	
	}
}
