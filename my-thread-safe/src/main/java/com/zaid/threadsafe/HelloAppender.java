package com.zaid.threadsafe;

import java.io.IOException;
/*
 * Immutable objects can have non thread-safe methods (No magics!).
 * https://dzone.com/articles/do-immutability-really-means.
 */
public final class HelloAppender {
	private final String greeting;

	public HelloAppender(String name) {
		this.greeting = "hello " + name + "!\n";
	}

	public void appendTo(Appendable app) throws IOException {
		app.append(greeting);
	}
}
