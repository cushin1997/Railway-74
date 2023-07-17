package com.vti.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vti.entity.Student;
import com.vti.ultis.ScannerUltis;

public class Ex1 {
	private java.util.List<Student> listStudent;

	public Ex1() {
	    listStudent = new ArrayList<Student>();
		System.out.println("Nhập số sinh viên muốn thêm: ");
		int num = ScannerUltis.inputInt();
		for (int i = 0; i < num - 3; i++) {
			Student st = new Student("Student " + (i + 1));
			listStudent.add(st);
		}
		Student st1 = new Student("Student Name");
		Student st2 = new Student("Student Name");
		Student st3 = new Student("Student Name");
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);
	}

	public void question1() {
		  loadMenuQues1(); 
		  while(true) {
			  loadMenuQues1();  
			  int chose = ScannerUltis.inputInt();
			  switch(chose) {
			  case 1:
				  System.out.println("Tổng số các sinh viên là: " +listStudent.size());
				  printStudent();
				  break;
			  case 2:
				  System.out.println("Phần tử thứ 4 là : " + listStudent.get(3));

				  break;
			  case 3:
				  System.out.println("Phần tử đầu là : " + listStudent.get(0));

				  System.out.println("Phần tử cuối là : " +listStudent.get(listStudent.size() - 1));
				  break;
			  case 4:
				  int choseCase4 = choseSubMenu4();
				  switch (choseCase4) {
				  	case 1:
				  System.out.println("Nhập tên của sinh viên cần thêm");

				  String name1 = ScannerUltis.inputString();
				  listStudent.add(0, new Student(name1));
				  printStudent();
				  break;
				  	case 2:

				  System.out.println("Nhập tên của sinh viên cần thêm");

				  String name2 = ScannerUltis.inputString();
				  listStudent.add(new Student(name2));
				  printStudent();
				  break;
				  }
				  break;
			  case 5:
				  System.out.println("Nhập tên của sinh viên cần thêm");

				  String name5 = ScannerUltis.inputString();
				  listStudent.add(new Student(name5));
				  printStudent();
				  break;
			  case 6:
				  Collections.reverse(listStudent);
				  System.out.println("Đã đảo ngược vị trí ");
				  printStudent();
				  break;
			  case 7:
				  System.out.println("Nhập vào ID cần tìm kiếm:");
				  int id7 = ScannerUltis.inputInt();
				  for (Student student : listStudent) {
				  if (student.getId() == id7) {
				  System.out.println(student);
				  }
				  }
				  break;
			  case 8:
				  System.out.println("Nhập vào name cần tìm kiếm:");
				  String name8 = ScannerUltis.inputString();
				  for (Student student : listStudent) {
				  if (student.getName().equals(name8)) {
				  System.out.println(student);
				  }
				
				  }
				  System.out.println("khong co sv nay ");
				  break;
			  case 9:
				  System.out.println("Các sinh viên trùng tên: ");
				  for (int i = 0; i < listStudent.size(); i++) {
				  for (int j = i + 1; j < listStudent.size();

				  j++) {

				  if

				  (listStudent.get(i).getName().equals(listStudent.get(j).getName())) {
				  System.out.println(listStudent.get(i).toString());

				  }
				  }
				  }
				  break;
			  case 10:
				  System.out.println("Nhập vào ID cần xóa tên:");
				  int id10 = ScannerUltis.inputInt();
				  for (Student student : listStudent) {
				  if (student.getId() == id10) {
				  student.setName(null);
				  }

				  }
				  printStudent();
				  break;
			  case 11:
				  System.out.println("Nhập vào ID của student cần xóa:");

				  int id11 = ScannerUltis.inputInt();
				  listStudent.removeIf(student -> student.getId() ==

				  id11);

				  printStudent();
				  break;
			  case 12:
				  System.out.println("Tạo mới ArrayCopy:");
				  List<Student> arrayCopy = new ArrayList<Student>();
				  arrayCopy.addAll(listStudent);
				  System.out.println("In phần tử trong ArrayCopy: ");
				  for (Student student : arrayCopy) {
				  System.out.println(student);
				  }
				  break;
			  case 13:
				  return;
				  default:
				  System.out.println("Hãy chọn đúng menu");
				  break;
				  }
				  }
				  }

	private void loadMenuQues1() {
		System.out.println("--- Lựa chọn chức năng muốn sử dụng---");

		System.out.println("--- 1.In ra tổng số phần tử của students---");

		System.out.println("--- 2.Lấy phần tử thứ 4 của students---");

		System.out.println("--- 3.In ra phần tử đầu và phần tử cuối của students ---");

		System.out.println("--- 4.Thêm 1 phần tử vào vị trí đầu hoặc cuốicủa students ---");

		System.out.println("--- 5.Thêm 1 phần tử vào vị trí cuối củastudents ---");

		System.out.println("--- 6.Đảo ngược vị trí của students ---");

		System.out.println("--- 7.Tạo 1 method tìm kiếm student theo id---");

		System.out.println("--- 8.Tạo 1 method tìm kiếm student theo name ---");

		System.out.println("--- 9.Tạo 1 method để in ra các student có trùngtên ---");

		System.out.println("--- 10.Xóa name của student có id = 2; ---");

		System.out.println("--- 11.Delete student có id = 5;---");

		System.out.println("--- 12.Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies ---");

		System.out.println("--- 13. Exit---");
	}

	private void printStudent() {
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}

	private int choseSubMenu4() {
		System.out.println("Chọn 1.Thêm vào đầu, 2.Thêm vào cuối");
		while (true) {
		
			case 2:	int chose1 = ScannerUltis.inputInt();
			switch (chose1) {
			case 1:
				return chose1;
				return chose1;
			default:
				System.out.println("Chọn lại: ");
			}
		}
	}
}
