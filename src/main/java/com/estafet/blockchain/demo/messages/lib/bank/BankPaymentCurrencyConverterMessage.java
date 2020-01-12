package com.estafet.blockchain.demo.messages.lib.bank;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BankPaymentCurrencyConverterMessage {

    private String currencyAmount;
    private CURRENCY currency;
    private String walletAddress;
    private String signature;
    private String transactionId;

    public BankPaymentCurrencyConverterMessage() {

    }

    public BankPaymentCurrencyConverterMessage(String currencyAmount, CURRENCY currency, String walletAddress, String signature,
                                     String transactionId) {
        this.currencyAmount = currencyAmount;
        this.currency = currency;
        this.walletAddress = walletAddress;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public BankPaymentCurrencyConverterMessage fromJSON(String message) {
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

    public String getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(String currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public CURRENCY getCurrency() {
        return currency;
    }

    public void setCurrency(CURRENCY currency) {
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
