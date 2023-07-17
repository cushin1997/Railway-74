package com.vti.entity;

import java.util.Scanner;

import com.vti.ultis.ScannerUltis;

public class Student {
	private int id;
	private String name;
	public static String colllect = "DHBK";
	public static int COUNT = 0;
	Scanner sc = new Scanner(System.in);
	public static double moneyGroup;

	 public Student(String name, int age) {
	        this.name = name;
	        
	        this.id = ++COUNT;  // Tăng giá trị biến count mỗi khi sinh viên mới được tạo
	    }
	
	public Student() {
		super();
		COUNT++;
		if (COUNT > 7 ) {
			System.err.println("Số lượng sinh viên đã vượt quá 7, không thể tạo thêm sinh viên");
		}else {
			this.id = COUNT; 
			System.out.println("Nhập vào tên SV:  ");
			this.name = ScannerUltis.inputString(); 
		}
		
		
		
	}

	public static double getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(double moneyGroup) {
		moneyGroup = moneyGroup;
	}

	public String getCollect() {
		return Student.colllect;
		}
		public void SetCollect(String newCollect) {
		Student.colllect = newCollect;
		}
	
		public static  int countSV() {
			return COUNT;
		}
		
		
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collect:" + colllect + "]";
	}

}
