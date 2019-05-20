package com.gaurav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;//jpa annotions 
	@Column
	private String name;
	@Column
	private String lastName;
	@Column
	private int yearLevel;
	public Student() { 
		
	}
	
	public Student(int studentId, String name, String lastName, int yearLevel) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.lastName = lastName;
		this.yearLevel = yearLevel;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	
}
