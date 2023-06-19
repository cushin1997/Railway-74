package entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String fullName;
	public String userName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;

}
