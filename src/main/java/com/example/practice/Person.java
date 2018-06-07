package com.example.practice;


public class Person {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	
	
	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
