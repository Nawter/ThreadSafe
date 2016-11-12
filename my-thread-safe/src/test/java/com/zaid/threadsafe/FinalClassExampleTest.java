package com.zaid.threadsafe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;
import static org.mutabilitydetector.unittesting.AllowedReason.assumingFields;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for FinalClassExampleShallowCopyTest
 */
public class FinalClassExampleTest {
	private FinalClassShallowCopyExample finalClassExample;
	private FinalClassDeepCopyExample finalClassDeepCopyExample;
	private HashMap<String, String> hashMap;
	private String name;
	private int id;

	@Before
	public void setUp() {
		hashMap = new HashMap<String, String>();
		hashMap.put("1", "first");
		hashMap.put("2", "second");
		name = "original";
		id = 10;
		finalClassExample = new FinalClassShallowCopyExample(id, name, hashMap);
		finalClassDeepCopyExample = new FinalClassDeepCopyExample(id, name, hashMap);
	}

	@Test
	public void checkTheShallowCopyOfImmutableClassAndReturnImmutable() {
		assertEquals(id, finalClassExample.getId());
		assertEquals(name, finalClassExample.getName());
		assertEquals(hashMap.size(), finalClassExample.getTestMap().size());
		// put new variables into the immutable class and see if its no change
		// it's immutable.
		id = 20;
		name = "modified";
		assertTrue(!name.equals(finalClassExample.getName()));
		assertTrue(id != finalClassExample.getId());
	}

	@Test
	public void checkTheShallowCopyOfImmutableClassChangingHashMapReturnMutable() {
		hashMap.put("3", "third");
		assertEquals(hashMap.size(), finalClassExample.getTestMap().size());
	}

	@Test
	public void checkTheShallowCopyOfImmutableClassWithNewHashMapReturnMutable() {
		HashMap<String, String> hmTest = finalClassExample.getTestMap();
		hmTest.put("4", "new");
		assertEquals(hmTest.size(), finalClassExample.getTestMap().size());
	}

	@Test
	public void checkTheDeepCopyOfImmutableClassWithChangingHashMapReturnImmutable() {
		hashMap.put("3", "third");
		assertTrue(hashMap.size() != finalClassDeepCopyExample.getTestMap().size());
	}

	@Test
	public void checkTheDeepCopyOfImmutableClassWithNewHashMapReturnImmutable() {
		HashMap<String, String> hmTest = (HashMap<String, String>) finalClassDeepCopyExample.getTestMap();
		hmTest.put("4", "new");
		assertTrue(hmTest.size() != finalClassDeepCopyExample.getTestMap().size());
	}
	
	
	 @Test 
	 public void checkFinalClassDeepCopyExampleImmutable() {
	     // use FieldAssumptions to insist the usage is safe
	  assertInstancesOf(FinalClassDeepCopyExample.class, 
	                    areImmutable(),
	                    assumingFields("map").areModifiedAsPartOfAnUnobservableCachingStrategy());
	 }
	 

	

}
