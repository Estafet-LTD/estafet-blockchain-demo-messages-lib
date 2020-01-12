package com.estafet.blockchain.demo.messages.lib;

import com.estafet.blockchain.demo.messages.lib.bank.BankPaymentMessage;
import com.estafet.blockchain.demo.messages.lib.bank.BankPaymentCurrencyConverterMessage;
import com.estafet.blockchain.demo.messages.lib.bank.BankPaymentBlockChainMessage;
import com.estafet.blockchain.demo.messages.lib.bank.BankPaymentConfirmationMessage;
import com.estafet.blockchain.demo.messages.lib.transaction.InvalidTransactionMessage;
import com.estafet.blockchain.demo.messages.lib.wallet.WalletPaymentMessage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageConverterTest {

    @Test
    public void testToFromJSONBankPaymentMessage(){
        BankPaymentMessage bankPaymentMessage = new BankPaymentMessage();
        bankPaymentMessage.setAmount(100);
        bankPaymentMessage.setWalletAddress("wwwwww");
        bankPaymentMessage.setSignature("fsegser");
        bankPaymentMessage.setTransactionId("111111111111");

        String json = bankPaymentMessage.toJSON();
        BankPaymentMessage resultMess = bankPaymentMessage.fromJSON(json);

        assertEquals(bankPaymentMessage.getAmount(),resultMess.getAmount(), 0);
        assertEquals(bankPaymentMessage.getWalletAddress(),resultMess.getWalletAddress());
        assertEquals(bankPaymentMessage.getSignature(),resultMess.getSignature());
        assertEquals(bankPaymentMessage.getTransactionId(),resultMess.getTransactionId());

    }

    @Test
    public void testToFromJSONBankToCurrencyConvMessage(){
        BankPaymentCurrencyConverterMessage bankPaymentCurrencyConverterMessage = new BankPaymentCurrencyConverterMessage();
        bankPaymentCurrencyConverterMessage.setCurrency("USD");
        bankPaymentCurrencyConverterMessage.setCurrencyAmount(101);
        bankPaymentCurrencyConverterMessage.setWalletAddress("efevsgeb");
        bankPaymentCurrencyConverterMessage.setSignature("fse24r2fewser");
        bankPaymentCurrencyConverterMessage.setTransactionId("3333333333");

        String json = bankPaymentCurrencyConverterMessage.toJSON();
        BankPaymentCurrencyConverterMessage resultMess = bankPaymentCurrencyConverterMessage.fromJSON(json);

        assertEquals(bankPaymentCurrencyConverterMessage.getCurrency(),resultMess.getCurrency());
        assertEquals(bankPaymentCurrencyConverterMessage.getCurrencyAmount(),resultMess.getCurrencyAmount(), 0);
        assertEquals(bankPaymentCurrencyConverterMessage.getWalletAddress(),resultMess.getWalletAddress());
        assertEquals(bankPaymentCurrencyConverterMessage.getSignature(),resultMess.getSignature());
        assertEquals(bankPaymentCurrencyConverterMessage.getTransactionId(),resultMess.getTransactionId());

    }

    @Test
    public void testToFromJSONCurrencyConvToValidatorMessage(){
        BankPaymentBlockChainMessage bankPaymentBlockChainMessage = new BankPaymentBlockChainMessage();
        bankPaymentBlockChainMessage.setCryptoAmount(5);
        bankPaymentBlockChainMessage.setWalletAddress("weegsgwgw");
        bankPaymentBlockChainMessage.setSignature("erherhssh");
        bankPaymentBlockChainMessage.setTransactionId("23222222");

        String json = bankPaymentBlockChainMessage.toJSON();
        BankPaymentBlockChainMessage resultMess = bankPaymentBlockChainMessage.fromJSON(json);

        assertEquals(bankPaymentBlockChainMessage.getCryptoAmount(),resultMess.getCryptoAmount());
        assertEquals(bankPaymentBlockChainMessage.getWalletAddress(),resultMess.getWalletAddress());
        assertEquals(bankPaymentBlockChainMessage.getSignature(),resultMess.getSignature());
        assertEquals(bankPaymentBlockChainMessage.getTransactionId(),resultMess.getTransactionId());
    }

    @Test
    public void testToFromJSONWalletPaymentMessage(){
        WalletPaymentMessage walletPaymentMessage = new WalletPaymentMessage();
        walletPaymentMessage.setCryptoAmount(2);
        walletPaymentMessage.setFromWalletAddress("aaa");
        walletPaymentMessage.setToWalletAddress("qqq");
        walletPaymentMessage.setSignature("qawsed");
        walletPaymentMessage.setTransactionId("1234");

        String json = walletPaymentMessage.toJSON();
        WalletPaymentMessage resultMess=walletPaymentMessage.fromJSON(json);

        assertEquals(walletPaymentMessage.getCryptoAmount(),resultMess.getCryptoAmount());
        assertEquals(walletPaymentMessage.getFromWalletAddress(),resultMess.getFromWalletAddress());
        assertEquals(walletPaymentMessage.getToWalletAddress(),resultMess.getToWalletAddress());
        assertEquals(walletPaymentMessage.getSignature(),resultMess.getSignature());
        assertEquals(walletPaymentMessage.getTransactionId(),resultMess.getTransactionId());

    }

    @Test
    public void testToFromJSONInvalidTransactionMessage(){
        InvalidTransactionMessage invalidTransactionMessage = new InvalidTransactionMessage();
        invalidTransactionMessage.setReason("signature is not valid");
        invalidTransactionMessage.setSignature("esgergs");
        invalidTransactionMessage.setTransactionId("444444");

        String json = invalidTransactionMessage.toJSON();
        InvalidTransactionMessage resultMess=invalidTransactionMessage.fromJSON(json);

        assertEquals(invalidTransactionMessage.getReason(),resultMess.getReason());
        assertEquals(invalidTransactionMessage.getSignature(),resultMess.getSignature());
        assertEquals(invalidTransactionMessage.getTransactionId(),resultMess.getTransactionId());
    }

    @Test
    public void testToFromJSONSuccessTransactionMessage(){
        BankPaymentConfirmationMessage bankPaymentConfirmationMessage = new BankPaymentConfirmationMessage();
        bankPaymentConfirmationMessage.setStatus("OK");
        bankPaymentConfirmationMessage.setSignature("wfewaeg");
        bankPaymentConfirmationMessage.setTransactionId("44444444");

        String json = bankPaymentConfirmationMessage.toJSON();
        BankPaymentConfirmationMessage resultMess=bankPaymentConfirmationMessage.fromJSON(json);

        assertEquals(bankPaymentConfirmationMessage.getStatus(),resultMess.getStatus());
        assertEquals(bankPaymentConfirmationMessage.getSignature(),resultMess.getSignature());
        assertEquals(bankPaymentConfirmationMessage.getTransactionId(),resultMess.getTransactionId());
    }
}
