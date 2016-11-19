package com.zaid.threadsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ImmutableRGBTest {
	
	private ImmutableRGB immutableRGB;
	private int testBlue;
	private int testRed;
	private int testGreen;
	private String testName;
	
	@Before
	public void setUp(){
		testBlue=1;
		testRed=11;
		testGreen=111;
		testName="name";
		immutableRGB=new ImmutableRGB(testBlue,testRed,testGreen,testName);
	}
	
	@Test
	public void checkIfImmutableRGBClassAndReturnImmutable() {
		assertEquals((testRed << 16) | (testGreen << 8) | testBlue, immutableRGB.getRGB());
	}
	
	
}
