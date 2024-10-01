package com.example.onetomanydemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ; 
private String name ;
private String block;
private String hod;
private int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBlock() {
	return block;
}
public void setBlock(String block) {
	this.block = block;
}
public String getHod() {
	return hod;
}
public void setHod(String hod) {
	this.hod = hod;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", block=" + block + ", hod=" + hod + "]";
}



}
