package com.vti.lesson11.entity;

public class Employee extends User {
 
    private String proSkill;
	
    
    
    
    





	public Employee( String proSkill) {
		
		this.proSkill = proSkill;
	}





	@Override
	public String toString() {
		return "Employee [ proSkill=" + proSkill + "]";
	}

}