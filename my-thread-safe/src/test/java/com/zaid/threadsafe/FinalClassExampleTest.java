package com.zaid.threadsafe;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for FinalClassExampleTest
 */
public class FinalClassExampleTest {
	private FinalClassExampleShallowCopy finalClassExample;
	private HashMap<String, String> hashMap;
	private String name;
	private int id;
	
	@Before
	public void setUp(){
		hashMap = new HashMap<String, String>();
		hashMap.put("1", "first");
		hashMap.put("2", "second");
		name="original";
		id=10;
		finalClassExample=new FinalClassExampleShallowCopy(id,name,hashMap);
		
	}

	@Test
	public void checkTheShallowCopyOfImmutableClass() {			
		assertEquals(id,finalClassExample.getId());
		assertEquals(name,finalClassExample.getName());
		assertEquals(hashMap.size(), finalClassExample.getTestMap().size());	
		// put new variables into the immutable class and see if its change so its not immutable.
		id=20;		
		name="modified";
		hashMap.put("3", "third");
		finalClassExample=new FinalClassExampleShallowCopy(id,name,hashMap);
		assertEquals(id,finalClassExample.getId());		
		assertEquals(name,finalClassExample.getName());
		assertEquals(hashMap.size(), finalClassExample.getTestMap().size());
	}

}
