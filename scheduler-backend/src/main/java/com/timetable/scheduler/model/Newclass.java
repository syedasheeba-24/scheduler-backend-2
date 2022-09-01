package com.timetable.scheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newclass")
public class Newclass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classid;
	
	@Column(name = "classnumber")
	private int classNumber;
	
	@Column(name = "section")
	private String section;
	
	@Column(name = "strength")
	private int strength;
	
	@Column(name = "subjects")
	private String subjects;

	public Newclass(int classid, int classNumber, String section, int strength, String subjects) {
		super();
		this.classid = classid;
		this.classNumber = classNumber;
		this.section = section;
		this.strength = strength;
		this.subjects = subjects;
	}

	public Newclass() {
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
}
