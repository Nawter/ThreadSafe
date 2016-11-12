package com.zaid.threadsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class FinalClassDeepCopyExample {

	private final int id;
	private final String name;
	private final HashMap<String, String> map;

	/*
	 * Return a copy rather than returning the actual object reference.
	 */
	public FinalClassDeepCopyExample(int id, String name, Map<String, String> hashMap) {
		this.id = id;
		this.name = name;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = hashMap.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			tempMap.put(key, hashMap.get(key));
		}
		this.map = tempMap;
	}

	public String getName() {
		return this.name;
	}

	/*
	 * Perform cloning of objects in the getter methods to return a copy rather
	 * than returning the actual object reference.
	 */
	public Map<String, String> getTestMap() {
		return (Map<String, String>) map.clone();
	}

	public int getId() {
		return this.id;
	}

}
