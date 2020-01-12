package com.estafet.blockchain.demo.messages.lib.bank;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class BankPaymentConfirmationMessage {

    private String status;
    private String signature;
    private String transactionId;

    public BankPaymentConfirmationMessage(){

    }

    public BankPaymentConfirmationMessage(String status, String signature, String transactionId) {
        this.status = status;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public static BankPaymentConfirmationMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, BankPaymentConfirmationMessage.class);
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
