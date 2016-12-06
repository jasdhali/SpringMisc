package com.apress.springrecipes.sequence;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SequenceGenerator {
	
	@Autowired
	private PrefixGenerator[] generators; 

	private String prefix;
	//@Autowired(required = false)	
	private String suffix;
	//@Autowired(required = false)
		
	private Integer initial;
	private Integer counter;
	private List<Object> suffixes;
	
	//@Autowired(required = false)
	//@Qualifier("yearPrefixGenerator")
	//@Resource(name="yearPrefixGenerator")	
	private PrefixGenerator prefixGenerator;

	public String getPrefix() {
		return prefix;
	}
	
	//@Required
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	@Autowired
	public SequenceGenerator(PrefixGenerator prefixGenerator) {
		super();
		this.prefixGenerator = prefixGenerator;
	}

	public SequenceGenerator(String prefix, String suffix, int initial,int counter) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
		this.counter = counter;
	}

	public SequenceGenerator() {
		super();
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append( prefixGenerator == null ? "[[ prefixGenerator is null ]]"	: prefixGenerator.getPrefix() );
		buffer.append( prefix );
		buffer.append( initial +   (counter++) );
		buffer.append( suffix );
		
		/*DecimalFormat formatter = new DecimalFormat("00000");
		if (suffixes != null) {
			for (Object suffix : suffixes) {
				buffer.append(" - ");
				buffer.append(formatter.format( suffix));
			}
		}*/
		
		return buffer.toString();
	}
	
	/*@Override
	public String toString() {
		return "SequenceGenerator [prefixGenerator=" + prefixGenerator
				+ ", suffix=" + suffix + ", initial=" + initial + ", counter="
				+ counter + "]";
	}*/
	
	public PrefixGenerator getPrefixGenerator() {
		return prefixGenerator;
	}
	/*public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("SequenceGenerator [prefix=" + prefix + ", suffix=" + suffix
				+ ", initial=" + initial + ", suffixes=" + suffixes + "]");
		if( prefixGenerator !=null){
			sb.append("prefixGenerator===>" + prefixGenerator.toString() );
			}
		return sb.toString();
	}*/
	
	/*
	 * public SequenceGenerator(PrefixGenerator prefixGenerator) {
	 * this.prefixGenerator = prefixGenerator; }
	 */
	public void destroy() {
		System.out.println("In method public void destroy()");
	}
	@Override
	public String toString() {
		return "SequenceGenerator [generators=" + Arrays.toString(generators)
				+ ", prefix=" + prefix + ", suffix=" + suffix + ", initial="
				+ initial + ", counter=" + counter + ", prefixGenerator="
				+ prefixGenerator + "]";
	}

	public SequenceGenerator(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	public SequenceGenerator(String prefix, int initial) {
		this.prefix = prefix;
		this.initial = initial;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	//@Required	
	public void setInitial(int initial) {
		this.initial = initial;
	}

	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}	
}