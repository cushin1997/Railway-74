package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import entity.Position.PositionName;
import entity.TypeQuestion.TypeName;

public class Question2 {
	public static void main(String[] args) {

		// Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "BOD";
		// Position

		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;

		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;

		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;

		// Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";

		// Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.userName = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		acc1.groups = groupAcc1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.userName = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		Group[] groupAcc2 = { group1, group2 };
		acc2.groups = groupAcc2;

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.userName = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		Group[] groupAcc3 = { group2, group3 };
		acc3.groups = groupAcc3;

		// GroupAccount
		GroupAccount gAcc1 = new GroupAccount();
		gAcc1.group = group1;
		gAcc1.account = acc1;
		gAcc1.JoinDate = LocalDate.of(2022, 07, 11);

		GroupAccount gAcc2 = new GroupAccount();
		gAcc2.group = group2;
		gAcc2.account = acc2;
		gAcc2.JoinDate = LocalDate.of(2022, 06, 05);

		GroupAccount gAcc3 = new GroupAccount();
		gAcc3.group = group3;
		gAcc3.account = acc3;
		gAcc3.JoinDate = LocalDate.of(2021, 05, 05);
		
		//TypeQuestion 
		
		TypeQuestion typeQ1 = new TypeQuestion ();
		typeQ1.id=1;
		typeQ1.name = TypeName.Essay;
		
		TypeQuestion typeQ2 = new TypeQuestion ();
		typeQ2.id=2;
		typeQ2.name = TypeName.Multiple_Choice;
		

		TypeQuestion typeQ3 = new TypeQuestion ();
		typeQ3.id=3;
		typeQ3.name = TypeName.Multiple_Choice;
		
		//CategoryQuestion
		CategoryQuestion CateQ1 = new CategoryQuestion();
		CateQ1.id=1;
		CateQ1.name= "Java";
		
		CategoryQuestion CateQ2 = new CategoryQuestion();
		CateQ2.id=2;
		CateQ2.name= "SQL";
		
		CategoryQuestion CateQ3 = new CategoryQuestion();
		CateQ3.id=3;
		CateQ3.name= "Ruby";
		
		//Question 
		Question ques1 =  new Question();
		ques1.id=1;
		ques1.content= "content1";
		ques1.type= typeQ1;
		ques1.creator = acc1;
		ques1.createDate = LocalDate.now();
		
		Question ques2 =  new Question();
		ques2.id=2;
		ques2.content= "content2";
		ques2.type= typeQ2;
		ques2.creator = acc2;
		ques2.createDate = LocalDate.now();
		
		
		Question ques3 =  new Question();
		ques3.id=3;
		ques3.content= "content3";
		ques3.type= typeQ3;
		ques3.creator = acc3;
		ques3.createDate = LocalDate.now();
		
		
		
		
		
		
		
		

	}
}
