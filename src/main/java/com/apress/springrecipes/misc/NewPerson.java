package com.apress.springrecipes.misc;

import java.util.Date;

public class NewPerson {
	private static int instanceCount;
	private String firstName;
	private String lastName;
	private Date dob;
	private Skill skill;

	public NewPerson() {
		System.out.println("This is instance number ==> " + instanceCount++);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", skill=" + skill + ", children=" + sb
				+ "]";
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}