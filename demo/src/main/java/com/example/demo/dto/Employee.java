package com.example.demo.dto;

import java.util.Objects;

public class Employee {

private String empId;
private String name;
private String age;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

@Override
public int hashCode() {
	return Objects.hash(age, empId, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(age, other.age) && Objects.equals(empId, other.empId) && Objects.equals(name, other.name);
}

public Employee(String empId, String name, String age) {
	super();
	this.empId = empId;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
}






}
