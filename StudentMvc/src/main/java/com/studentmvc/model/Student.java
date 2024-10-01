package com.studentmvc.model;

public class Student {
private int id ;
private String name;
private String phon;
private String gender;
private float marks;

private String city;
public Student() {
	
}
public Student(int id, String name, String phon, String gender, float marks, String city) {
	super();
	this.id = id;
	this.name = name;
	this.phon = phon;
	this.gender = gender;
	this.marks = marks;
	this.city = city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhon() {
	return phon;
}
public void setPhon(String phon) {
	this.phon = phon;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
