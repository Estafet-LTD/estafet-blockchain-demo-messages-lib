package com.estafet.blockchain.demo.messages.lib.wallet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NewWalletMessageTest {

	@Test
	public void testFromJSONtoJSON() {
		NewWalletMessage message1 = new NewWalletMessage();
		message1.setCurrency("USD");
		message1.setPublicKey("ddsssss");
		message1.setWalletAddress("sssss");
		message1.setWalletName("ssjsjs");
		String json1 = message1.toJSON();
		NewWalletMessage toMessage = NewWalletMessage.fromJSON(json1);
		assertEquals(json1, toMessage.toJSON());
	}

}
