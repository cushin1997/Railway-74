package com.vti.lesson11.entity;

public class Manager extends User {
    private int expInYear;

	
    
    
    
    
   
    
    
	public Manager(int expInYear) {
		this.expInYear = expInYear;
		
	}




	public int getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}


	@Override
	public String toString() {
		return "Manager [expInYear=" + expInYear + ", id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + ", getExpInYear()=" + getExpInYear() + ", getId()=" + getId()
				+ ", getFullName()=" + getFullName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				
				+ "]";
	}

	

	


}
