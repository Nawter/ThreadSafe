package com.zaid.threadsafe;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * The ImmutableSimpleDateFormat example.
 * https://dzone.com/articles/do-immutability-really-means
 */
public final class VerySimpleDateFormat {
	private final DateFormat formatter = SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT);
	public String format(Date d) {
		return formatter.format(d);
	}
}
