package com.ishika.remo.Entity;
import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	int id;
	@Column(name="name")
	String name;
	@Column(name="dept")
	String dept;
	@Column(name="designation")
	String designation;

	Employee(){}

	public Employee(int id,String name,String dept,String designation)
	{
	super();
	this.id=id;
	this.name=name;
	this.designation=designation;
	this.dept=dept;
	}
	public int getId()
	{
	return id;
	}
	public void setId(int id)
	{
	this.id=id;
	}
	public String getName()
	{
	return name;
	}
	public void setName(String name)
	{
	this.name=name;
	}
	public String getDept()
	{
	return dept;
	}
	public void setDept(String dept)
	{
	this.dept=dept;
	}

	public String getDesignation()
	{
	return designation;
	}
	public void setDesignation(String designation)
	{
	this.designation=designation;
	}
	@Override
	public String toString()
	{
	return "Employee id = " +id + " name = " +name + "department =" +dept + "designation =" +designation;
	}
}

