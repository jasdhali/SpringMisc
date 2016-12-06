package com.apress.springrecipes.misc;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	private static int instanceCount;
	
	private String firstName;
	private String lastName;
	
	@Autowired(required=false)
	@Qualifier("dob2")
	private Date 	dob;
	
	private Skill  	skill;
	/*
	@Autowired
	private List<Child>  children;
	
	@Autowired
	private Map<String,Child> childMap;
	*/
	public Person() {
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
	
	/*@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", skill=" + skill + "]";
	}
	*/
	
	/*@Autowired
	public Person(Date dob) {
		this.dob = dob;
	}*/
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		/*for (Iterator iterator = children.iterator(); iterator.hasNext();) {
			Child child = (Child) iterator.next();
			sb.append( child.toString() );
		}
		for (Iterator iterator = childMap.values().iterator(); iterator.hasNext();) {
			Child child = (Child) iterator.next();
			sb.append( "Map Entry===>" + child.toString() + "\n" );
		}*/
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", skill=" + skill + ", children="
				+ sb + "]";
	}

	/*@Autowired(required=false)
	public void arbitrary(@Qualifier("dob1") Date dob,Skill skill){
		setSkill(skill);
		this.dob = dob;
	}*/

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	
	/*public List<Child> getChildren() {
		return children;
	}

	
	public void setChildren(List<Child> children) {
		this.children = children;
	}*/	
}