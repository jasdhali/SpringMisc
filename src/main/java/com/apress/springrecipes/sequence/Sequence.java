package com.apress.springrecipes.sequence;


public class Sequence {

	private String id;
	private String prefix;
	private String suffix;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public Sequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sequence(String id, String prefix, String suffix) {
		this.id = id;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	@Override
	public String toString() {
		return "Sequence [id=" + id + ", prefix=" + prefix + ", suffix="
				+ suffix + "]";
	}
	
}