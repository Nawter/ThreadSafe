package com.zaid.threadsafe;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FinalClassExampleTest {
	private FinalClassExample finalClassExample;
	private HashMap<String, String> hashMap;
	private String name;
	private int id;
	
	@Before
	public void setUp(){
		hashMap = new HashMap<String, String>();
		name="original";
		id=10;
		finalClassExample=new FinalClassExample(id,name,hashMap);
		
	}

	@Test
	public void checkTheDeepCopyOfImmutableClass() {			
		assertEquals(id,finalClassExample.getId());
		assertEquals(name,finalClassExample.getName());
		assertEquals(hashMap, finalClassExample.getTestMap());		
	}

}
