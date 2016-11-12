package com.zaid.threadsafe;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

import org.junit.Test;
import org.mutabilitydetector.unittesting.AllowedReason;

/*
 * When we test this class its Immutable in the words of DZone/JavaZone, but if we use Mutability Detector we have a result
 * of non Immutable
 */
public class StringImmutableTest {
	@Test
	public void checkStringImmutableIsImmutable() {
		assertInstancesOf(StringImmutable.class, areImmutable(), AllowedReason.allowingNonFinalFields(),
				AllowedReason.assumingFields("hash").areModifiedAsPartOfAnUnobservableCachingStrategy());
	}
}
