package com.estafet.blockchain.demo.messages.lib.bank;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class BankPaymentBlockChainMessage {

    private String cryptoAmount;
    private String walletAddress;
    private String signature;
    private String transactionId;

    public BankPaymentBlockChainMessage (){

    }

    public BankPaymentBlockChainMessage(String cryptoAmount, String walletAddress, String signature, String transactionId) {
        this.cryptoAmount = cryptoAmount;
        this.walletAddress = walletAddress;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public static BankPaymentBlockChainMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, BankPaymentBlockChainMessage.class);
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

    public String getCryptoAmount() {
        return cryptoAmount;
    }

    public void setCryptoAmount(String cryptoAmount) {
        this.cryptoAmount = cryptoAmount;
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
