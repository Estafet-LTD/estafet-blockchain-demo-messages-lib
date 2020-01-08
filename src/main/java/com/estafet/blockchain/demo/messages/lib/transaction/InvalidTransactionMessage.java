package com.estafet.blockchain.demo.messages.lib.transaction;

import com.estafet.blockchain.demo.messages.lib.wallet.WalletPaymentMessage;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class InvalidTransactionMessage {

    private String reason;
    private String signature;
    private String transactionId;

    public InvalidTransactionMessage () {

    }

    public InvalidTransactionMessage(String reason, String signature, String transactionId) {
        this.reason = reason;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public InvalidTransactionMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, InvalidTransactionMessage.class);
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
