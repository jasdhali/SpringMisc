package com.apress.springrecipes.sequence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrefixGenerator implements PrefixGenerator {
	private DateFormat formatter;	
	public String getPrefix() {
		return formatter.format(new Date());
	}	
	public void setPattern(String pattern){
		this.formatter = new SimpleDateFormat(pattern);
	}
	
	@Override
	public String toString() {
		return "DatePrefixGenerator [formatter=" + formatter.toString() + "==Pattern ] ";
	}
	
}
