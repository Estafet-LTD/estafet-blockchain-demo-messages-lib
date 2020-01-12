package com.estafet.blockchain.demo.messages.lib.wallet;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UpdateWalletBalanceMessage {

	private String walletAddress;
	
	private String signature;
	
	private int balance;

	public String getWalletAddress() {
		return walletAddress;
	}

	public void setWalletAddress(String walletAddress) {
		this.walletAddress = walletAddress;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static UpdateWalletBalanceMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, UpdateWalletBalanceMessage.class);
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
