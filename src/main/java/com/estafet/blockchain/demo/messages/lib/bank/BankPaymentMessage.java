package com.estafet.blockchain.demo.messages.lib.bank;

import com.estafet.blockchain.demo.messages.lib.wallet.WalletPaymentMessage;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class BankPaymentMessage {

    private String currencyAmount;
    private CURRENCY currency;
    private String fromAccountNumber;
    private String toAccountNumber;
    private String signature;
    private String transactionId;


    public BankPaymentMessage() {

    }

    public BankPaymentMessage(String currencyAmount, CURRENCY currency, String fromAccountNumber, String toAccountNumber,
                              String signature, String transactionId) {
        this.currencyAmount = currencyAmount;
        this.currency = currency;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public BankPaymentMessage fromJSON(String message) {
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

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
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
