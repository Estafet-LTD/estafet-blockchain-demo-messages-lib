package com.estafet.blockchain.demo.messages.lib;

import com.estafet.blockchain.demo.messages.lib.bank.BankPaymentMessage;
import com.estafet.blockchain.demo.messages.lib.bank.BankToCurrencyConvMessage;
import com.estafet.blockchain.demo.messages.lib.bank.CURRENCY;
import com.estafet.blockchain.demo.messages.lib.bank.CurrencyConvToValidatorMessage;
import com.estafet.blockchain.demo.messages.lib.wallet.WalletPaymentMessage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageConverterTest {

    @Test
    public void testToFromJSONBankPaymentMessage(){
        BankPaymentMessage bankPaymentMessage = new BankPaymentMessage();
        bankPaymentMessage.setCurrency(CURRENCY.EUR);
        bankPaymentMessage.setCurrencyAmount("100");
        bankPaymentMessage.setFromAccountNumber("wwwwww");
        bankPaymentMessage.setToAccountNumber("gaerg");
        bankPaymentMessage.setSignature("fsegser");
        bankPaymentMessage.setTransactionId("111111111111");

        String json = bankPaymentMessage.toJSON();
        BankPaymentMessage resultMess = bankPaymentMessage.fromJSON(json);

        assertEquals(bankPaymentMessage.getCurrency(),resultMess.getCurrency());
        assertEquals(bankPaymentMessage.getCurrencyAmount(),resultMess.getCurrencyAmount());
        assertEquals(bankPaymentMessage.getFromAccountNumber(),resultMess.getFromAccountNumber());
        assertEquals(bankPaymentMessage.getToAccountNumber(),resultMess.getToAccountNumber());
        assertEquals(bankPaymentMessage.getSignature(),resultMess.getSignature());
        assertEquals(bankPaymentMessage.getTransactionId(),resultMess.getTransactionId());

    }

    @Test
    public void testToFromJSONBankToCurrencyConvMessage(){
        BankToCurrencyConvMessage bankToCurrencyConvMessage = new BankToCurrencyConvMessage();
        bankToCurrencyConvMessage.setCurrency(CURRENCY.USD);
        bankToCurrencyConvMessage.setCurrencyAmount("101");
        bankToCurrencyConvMessage.setWalletAddress("efevsgeb");
        bankToCurrencyConvMessage.setSignature("fse24r2fewser");
        bankToCurrencyConvMessage.setTransactionId("3333333333");

        String json = bankToCurrencyConvMessage.toJSON();
        BankToCurrencyConvMessage resultMess = bankToCurrencyConvMessage.fromJSON(json);

        assertEquals(bankToCurrencyConvMessage.getCurrency(),resultMess.getCurrency());
        assertEquals(bankToCurrencyConvMessage.getCurrencyAmount(),resultMess.getCurrencyAmount());
        assertEquals(bankToCurrencyConvMessage.getWalletAddress(),resultMess.getWalletAddress());
        assertEquals(bankToCurrencyConvMessage.getSignature(),resultMess.getSignature());
        assertEquals(bankToCurrencyConvMessage.getTransactionId(),resultMess.getTransactionId());

    }

    @Test
    public void testToFromJSONCurrencyConvToValidatorMessage(){
        CurrencyConvToValidatorMessage currencyConvToValidatorMessage = new CurrencyConvToValidatorMessage();
        currencyConvToValidatorMessage.setCryptoAmount("5");
        currencyConvToValidatorMessage.setWalletAddress("weegsgwgw");
        currencyConvToValidatorMessage.setSignature("erherhssh");
        currencyConvToValidatorMessage.setTransactionId("23222222");

        String json = currencyConvToValidatorMessage.toJSON();
        CurrencyConvToValidatorMessage resultMess = currencyConvToValidatorMessage.fromJSON(json);

        assertEquals(currencyConvToValidatorMessage.getCryptoAmount(),resultMess.getCryptoAmount());
        assertEquals(currencyConvToValidatorMessage.getWalletAddress(),resultMess.getWalletAddress());
        assertEquals(currencyConvToValidatorMessage.getSignature(),resultMess.getSignature());
        assertEquals(currencyConvToValidatorMessage.getTransactionId(),resultMess.getTransactionId());
    }

    @Test
    public void testToFromJSONWalletPaymentMessage(){
        WalletPaymentMessage walletPaymentMessage = new WalletPaymentMessage();
        walletPaymentMessage.setCryptoAmount("2");
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
        SuccessTransactionMessage successTransactionMessage = new SuccessTransactionMessage();
        successTransactionMessage.setStatus("OK");
        successTransactionMessage.setSignature("wfewaeg");
        successTransactionMessage.setTransactionId("44444444");

        String json = successTransactionMessage.toJSON();
        SuccessTransactionMessage resultMess=successTransactionMessage.fromJSON(json);

        assertEquals(successTransactionMessage.getStatus(),resultMess.getStatus());
        assertEquals(successTransactionMessage.getSignature(),resultMess.getSignature());
        assertEquals(successTransactionMessage.getTransactionId(),resultMess.getTransactionId());
    }
}
