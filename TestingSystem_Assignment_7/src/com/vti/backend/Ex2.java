package com.vti.backend;

import com.vti.entity.MyMathEx2;
import com.vti.entity.StudentEx2;
import com.vti.ultis.ScannerUltis;

public class Ex2 {
	public void question1() {
		System.out.println("Chương trình tính tổng số int với PI");
		System.out.println("Nhập vào 1 số int: ");
		int a = ScannerUltis.inputInt();
		System.out.println("Tổng với PI là: " + MyMathEx2.sum(a));
}
	public void question2() {
		
		System.out.println("Khởi tạo Student");
		System.out.println("Nhập vào ID:");
		int id = ScannerUltis.inputInt();
		System.out.println("Nhập vào Name:");
		String name = ScannerUltis.inputString();
		StudentEx2 stEx2 = new StudentEx2(id, name);
		System.out.println("Thông tin sinh viên vừa nhập: ");
		System.out.println(stEx2);
		}
}