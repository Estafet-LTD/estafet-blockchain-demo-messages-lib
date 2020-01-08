package com.estafet.blockchain.demo.messages.lib.bank;

import com.estafet.blockchain.demo.messages.lib.wallet.WalletPaymentMessage;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CurrencyConvToValidatorMessage {

    private String cryptoAmount;
    private String walletAddress;
    private String signature;
    private String transactionId;

    public CurrencyConvToValidatorMessage (){

    }

    public CurrencyConvToValidatorMessage(String cryptoAmount, String walletAddress, String signature, String transactionId) {
        this.cryptoAmount = cryptoAmount;
        this.walletAddress = walletAddress;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public CurrencyConvToValidatorMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, CurrencyConvToValidatorMessage.class);
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
