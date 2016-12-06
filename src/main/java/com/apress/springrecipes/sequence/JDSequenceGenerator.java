package com.apress.springrecipes.sequence;

import java.util.Iterator;
import java.util.List;


public class JDSequenceGenerator {

	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	private List<Object> suffixes;

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		for (Iterator<Object> iterator = suffixes.iterator(); iterator.hasNext();) {
			Object suffix =  iterator.next();
			buffer.append("-");
			buffer.append(suffix);
		}
		return buffer.toString();
	}

	public void destroy() {
		System.out.println("In method public void destroy()");
	}

	public JDSequenceGenerator(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}

	public JDSequenceGenerator() {
		super();
	}

	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}
	
	
}