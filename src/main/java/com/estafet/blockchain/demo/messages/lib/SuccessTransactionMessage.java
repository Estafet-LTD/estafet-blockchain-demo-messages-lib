package com.estafet.blockchain.demo.messages.lib;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class SuccessTransactionMessage {

    private String status;
    private String signature;
    private String transactionId;

    public SuccessTransactionMessage(){

    }

    public SuccessTransactionMessage(String status, String signature, String transactionId) {
        this.status = status;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public SuccessTransactionMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, SuccessTransactionMessage.class);
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
