package com.zaid.threadsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

import org.junit.Before;
import org.junit.Test;

public class ImmutableRGBTest {

	private ImmutableRGB immutableRGB;
	private int testBlue;
	private int testRed;
	private int testGreen;
	private String testName;

	@Before
	public void setUp() {
		testBlue = 1;
		testRed = 11;
		testGreen = 111;
		testName = "name";
		immutableRGB = new ImmutableRGB(testRed, testGreen, testBlue, testName);
	}

	@Test
	public void checkIfImmutableRGBClassIsImmutable() {
		assertEquals((testRed << 16) | (testGreen << 8) | testBlue, immutableRGB.getRGB());
		assertEquals(testName, immutableRGB.getName());
		testBlue = 2;
		testRed = 22;
		testGreen = 222;
		testName = "eman";
		assertFalse(((testRed << 16) | (testGreen << 8) | testBlue) == immutableRGB.getRGB());
		assertFalse(testName.equals(immutableRGB.getName()));
	}
	
	@Test
	public void checkIfImmutableRGBClassIsImmutableUsingMutabilityDetector() {
		assertInstancesOf(ImmutableRGB.class, areImmutable());
	}
	
	

}
