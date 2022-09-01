package com.timetable.scheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowid;
	
	public int getRowid() {
		return rowid;
	}

	public void setRowid(int rowid) {
		this.rowid = rowid;
	}

	@Column(name="id")
	private int id;
	
	@Column(name="subjects")
	private String subjects;
	
	@Column(name="subjectid")
	private int subjectid;
	
	public Subject() {
		
	}

	public Subject(int id, String subjects, int subjectid,int rowid) {
		super();
		this.id = id;
		this.subjects = subjects;
		this.subjectid = subjectid;
		this.rowid = rowid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	
	
}
