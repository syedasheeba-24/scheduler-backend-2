package com.timetable.scheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	@Column(name="class")
	private String classes;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherid;
	
	@Column(name="subject")
	private String subject;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String classes, int teacherid, String subject) {
		super();
		this.classes = classes;
		this.teacherid = teacherid;
		this.subject = subject;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
