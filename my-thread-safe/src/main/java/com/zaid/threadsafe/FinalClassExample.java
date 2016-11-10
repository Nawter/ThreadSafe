package com.zaid.threadsafe;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class FinalClassExample {

	public FinalClassExample(int i, String s, HashMap<String, String> hashMap) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return "original";
	}

	public Map<String, String> getTestMap() {
		return new HashMap<String, String>();
	}

	public int getId() {
		return 10;
	}

}
