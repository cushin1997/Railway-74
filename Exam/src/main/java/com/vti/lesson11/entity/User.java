package com.vti.lesson11.entity;

public class User {
	
	    protected int id;
	    protected String fullName;
	    protected String email;
	    protected String password;
	    private int projectId;
	    private Manager manager;
        private Employee  employee;
			
		


	    
	    public User() {
		}




		public User(int id, String fullName, String email, String password) {
	        this.id = id;
	        this.fullName = fullName;
	        this.email = email;
	        this.password = password;
	    }




		public int getId() {
			return id;
		}




		public void setId(int id) {
			this.id = id;
		}




		public String getFullName() {
			return fullName;
		}




		public void setFullName(String fullName) {
			this.fullName = fullName;
		}




		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public String getPassword() {
			return password;
		}




		public void setPassword(String password) {
			this.password = password;
		}




		public Manager getManager() {
			return manager;
		}




		public void setManager(Manager manager) {
			this.manager = manager;
		}




		public Employee getEmployee() {
			return employee;
		}




		public void setEmployee(Employee employee) {
			this.employee = employee;
		}




		@Override
		public String toString() {
			return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
					+ ", manager=" + manager +  "]";
		}










}


