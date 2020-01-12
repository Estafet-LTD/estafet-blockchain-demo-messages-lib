package com.estafet.blockchain.demo.messages.lib.bank;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BankPaymentCurrencyConverterMessage {

    private double currencyAmount;
    private String currency;
    private String walletAddress;
    private String signature;
    private String transactionId;

    public BankPaymentCurrencyConverterMessage() {

    }

    public BankPaymentCurrencyConverterMessage(double currencyAmount, String currency, String walletAddress, String signature,
                                     String transactionId) {
        this.currencyAmount = currencyAmount;
        this.currency = currency;
        this.walletAddress = walletAddress;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public static BankPaymentCurrencyConverterMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, BankPaymentCurrencyConverterMessage.class);
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

    public double getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(double currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
