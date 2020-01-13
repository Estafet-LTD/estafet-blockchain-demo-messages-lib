package com.estafet.blockchain.demo.messages.lib.transaction;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TransactionHashConfirmationMessage {

	private String hash;

	private String transactionId;

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public static TransactionHashConfirmationMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, TransactionHashConfirmationMessage.class);
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
