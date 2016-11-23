package io.github.mschonaker.ratpackhello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ratpack.http.client.ReceivedResponse;
import ratpack.test.ApplicationUnderTest;
import ratpack.test.MainClassApplicationUnderTest;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private ApplicationUnderTest app = new MainClassApplicationUnderTest(App.class);

	@Test
	public void testSimpleHello() {

		ReceivedResponse response = app.getHttpClient().get();
		assertEquals(200, response.getStatus().getCode());
		assertEquals("Hello, world!", response.getBody().getText());

	}

	@Test
	public void testSimpleHelloWithPath() {

		ReceivedResponse response = app.getHttpClient().get("Martín");
		assertEquals(200, response.getStatus().getCode());
		assertEquals("Hello, Martín!", response.getBody().getText());

	}
}
