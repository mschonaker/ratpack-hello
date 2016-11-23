package io.github.mschonaker.ratpackhello;

import ratpack.server.RatpackServer;

/**
 * Hello world!
 */
public class App {

	static {
		System.setProperty("org.slf4j.simpleLogger.logFile", "System.out");
	}

	public static void main(String[] args) throws Exception {
		RatpackServer.start(server -> server//
				.handlers(chain -> chain//
						.get(ctx -> ctx.render("Hello, world!"))//
						.get(":name", ctx -> ctx.render("Hello, " + ctx.getPathTokens().get("name") + "!")//
		)));
	}
}
