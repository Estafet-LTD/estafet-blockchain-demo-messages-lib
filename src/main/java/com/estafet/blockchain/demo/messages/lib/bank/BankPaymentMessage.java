package com.estafet.blockchain.demo.messages.lib.bank;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class BankPaymentMessage {

	private double amount;
	private String walletAddress;
	private String signature;
	private String transactionId;

	public BankPaymentMessage() {

	}

	public BankPaymentMessage(double amount, String walletAddress, String signature, String transactionId) {
		this.amount = amount;
		this.walletAddress = walletAddress;
		this.signature = signature;
		this.transactionId = transactionId;
	}

	public static BankPaymentMessage fromJSON(String message) {
		try {
			return new ObjectMapper().readValue(message, BankPaymentMessage.class);
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

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

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
