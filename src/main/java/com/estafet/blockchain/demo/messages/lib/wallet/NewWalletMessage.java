package com.estafet.blockchain.demo.messages.lib.wallet;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NewWalletMessage {

	private String walletAddress;

	private String walletName;

	private String currency;

	private String publicKey;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getWalletAddress() {
		return walletAddress;
	}

	public void setWalletAddress(String walletAddress) {
		this.walletAddress = walletAddress;
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}
	
    public static NewWalletMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, NewWalletMessage.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toJSON() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
