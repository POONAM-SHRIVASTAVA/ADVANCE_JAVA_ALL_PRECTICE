package com.example.Emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Emp {

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name ="emp_id")
	private int id;

@Column(name="emp_name")
	private String name;
@Column(name="emp_city")
	private String city;
@Column(name="emp_department")
	private String department;

@Column(name="emp_salary")
	private float salary;

	public Emp() {
		
	}
	public Emp(int id, String name, String city, String department, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.department = department;
		this.salary = salary;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", city=" + city + ", department=" + department + ", salary="
				+ salary + "]";
	}
	
	
}
