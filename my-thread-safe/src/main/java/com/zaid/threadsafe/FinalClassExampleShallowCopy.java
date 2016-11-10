package com.zaid.threadsafe;

import java.util.HashMap;
import java.util.Map;

/**
 * FinalClassExampleShallowCopy
 *
 */
public final class FinalClassExampleShallowCopy {

	private final int id;
	private final String name;
	private final HashMap<String, String> map;

	public FinalClassExampleShallowCopy(int id, String name, HashMap<String, String> hashMap) {
		this.id=id;
		this.name=name;
		this.map=hashMap;
	}

	public String getName() {
		return this.name;
	}

	public HashMap<String, String> getTestMap() {
		return this.map; 
	}

	public int getId() {
		return this.id;
	}

}
