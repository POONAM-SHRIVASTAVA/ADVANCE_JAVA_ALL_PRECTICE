package com.example.Hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)// it a import javax ,it a genrate type how to genrate to use stretegy =
private int  id;
	@Column(nullable=false)
private String name ;
private float Salary;
@Column(unique=true)
private String phone;
public Employee() {
	
}
public Employee(int id, String name, float salary, String phone) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
	this.phone = phone;
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
public float getSalary() {
	return Salary;
}
public void setSalary(float salary) {
	Salary = salary;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", phone=" + phone + "]";
}

}
