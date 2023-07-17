package com.vti.entity;

public class StudentEx2 {
	private int id;
	private String name;

	public StudentEx2(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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

	@Override
	public String toString() {
		return "StudentEx2 [id=" + id + ", name=" + name + "]";
	}



}
