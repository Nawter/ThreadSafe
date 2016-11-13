package com.zaid.threadsafe;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

import org.junit.Test;



public class VerySimpleDateFormatTest {
	@Test
	public void checkVerySimpleDateFormatIsImmutable() {
		assertInstancesOf(VerySimpleDateFormat.class, areImmutable());
	}

}
