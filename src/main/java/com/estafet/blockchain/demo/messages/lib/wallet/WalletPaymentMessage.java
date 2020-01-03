package com.estafet.blockchain.demo.messages.lib.wallet;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class WalletPaymentMessage {

    private String cryptoAmount;
    private String fromWalletAddress;
    private String toWalletAddress;
    private String signature;
    private String transactionId;

    public WalletPaymentMessage() {

    }

    public WalletPaymentMessage(String cryptoAmount, String fromWalletAddress, String toWalletAddress, String signature,
                                String transactionId) {
        this.cryptoAmount = cryptoAmount;
        this.fromWalletAddress = fromWalletAddress;
        this.toWalletAddress = toWalletAddress;
        this.signature = signature;
        this.transactionId = transactionId;
    }

    public static WalletPaymentMessage fromJSON(String message) {
        try {
            return new ObjectMapper().readValue(message, WalletPaymentMessage.class);
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

    public String getFromWalletAddress() {
        return fromWalletAddress;
    }

    public void setFromWalletAddress(String fromWalletAddress) {
        this.fromWalletAddress = fromWalletAddress;
    }

    public String getToWalletAddress() {
        return toWalletAddress;
    }

    public void setToWalletAddress(String toWalletAddress) {
        this.toWalletAddress = toWalletAddress;
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
