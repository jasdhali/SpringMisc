package com.apress.springrecipes.misc;

public class Skill {

	private String skillName;

	public Skill() {
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + "]";
	}
	
}