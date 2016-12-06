package com.apress.springrecipes.misc;

import java.util.Arrays;
import java.util.Date;

public class Child extends Person {

	public Child() {
		// TODO Auto-generated constructor stub
	}

	public Child(Date dob) {
		//super(dob);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Child [getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() +  "]";
	}

	
}
