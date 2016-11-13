package com.zaid.threadsafe;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

import org.junit.Test;

public class HelloAppenderTest {
	@Test
	public void checkHelloAppenderIsImmutable() {
		assertInstancesOf(HelloAppender.class, areImmutable());
	}
}
