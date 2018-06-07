package com.example.homework;


public class Student {

	private int id;
	private String name;
	private int scroe;
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.scroe = score;
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
	public int getScroe() {
		return scroe;
	}
	public void setScroe(int scroe) {
		this.scroe = scroe;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scroe=" + scroe + "]";
	}
	
}
