package com.zaid.threadsafe;

import java.util.Arrays;

/*
 * StringImmutable is considered immutable. Looking at its implementation, we can deduce one thing: 
 * an immutable string can change its internal state (in this case, the hashcode which is lazy loaded) 
 * as long as it is not externally visible.
 */

public class StringImmutable {
	private final char value[];
	private int hash;

	public StringImmutable(char value[]) {
		this.value = Arrays.copyOf(value, value.length);
	}

	// Thread-Safe method.
	public int hashCode() {
		int h = hash;
		if (h == 0 && value.length > 0) {
			char val[] = value;
			for (int i = 0; i < value.length; i++) {
				h = 31 * h + val[i];
			}
			hash = h;
		}
		return h;
	}

	// No thread-safe method
	// public int hashCode() {
	// if (hash == 0 && value.length > 0) {
	// char val[] = value;
	// for (int i = 0; i < value.length; i++) {
	// hash = 31 * hash + val[i];
	// }
	// }
	// return hash;
	// }

}
