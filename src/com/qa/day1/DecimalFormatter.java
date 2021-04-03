package com.qa.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalFormatter {
	
	String fmt;
	
	public DecimalFormatter (String f) {
		fmt = f;
	}
	
	public String format(Double d) {
		Pattern pattern = Pattern.compile("[^#]*#");
		Matcher matcher = pattern.matcher(fmt);
		long count = matcher.results().count();
		return String.format("%." + count + "f", d);
	}
}
