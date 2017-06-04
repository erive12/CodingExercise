/**
 * 
 */
package com.rivera.eliutt.capitalone.coding_excersice.authentication;


import com.google.gson.annotations.SerializedName;

/**
 * @author Eliutt
 *
 */
public class CommonArgumentFields {
	private Integer uid;
	private String token;
	@SerializedName("api-token")
	private String apiToken;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getApiToken() {
		return apiToken;
	}
	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}
}	
