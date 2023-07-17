package com.vti.backend;

import com.vti.entity.MyMath;
import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;
import com.vti.entity.Student;
import com.vti.ultis.ScannerUltis;

public class Ex1 {
	public void question1() {
		Student[] stuArr = new Student[3];
		System.out.println("Khởi tạo 3 SV ");
		for (int i = 0; i < 3; i++) {
			System.out.println(" Sinh Viên" + " " + (i + 1 + ":"));
			Student st = new Student();
			stuArr[i] = st;

		}

		System.out.println("Thông tin các sinh viên vừa nhập: ");
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i]);
		}
		System.out.println("Chuyển các sinh viên sang Đại học công nghệ:");

		Student.colllect = "Đại học Công nghệ ";
		System.out.println("Thông tin sinh viên sau khi chuyển ");
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i]);
		}
	}

	public void question2() {
		Student[] stuArr = new Student[3];
		System.out.println("Khởi tạo 3 SV ");
		for (int i = 0; i < 3; i++) {
			System.out.println(" Sinh Viên" + " " + (i + 1 + ":"));
			Student st = new Student();
			stuArr[i] = st;
		}
		System.out.println("Các Student sẽ nộp quỹ, mỗi Student 100k");
		System.out.println("Tổng Qũy : " + (Student.moneyGroup += 300));
		System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		System.out.println("Tổng Quỹ còn lại  " + (Student.moneyGroup -= 50));
		System.out.println("Student thứ 2 lấy 20k đi mua bánh mì: ");

		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 20));
		System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm: ");

		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 150));
		System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k:");

		System.out.println("Tổng quỹ: " + (Student.moneyGroup += 150));
	}

	public void question3() {

		System.out.println("Nhập vào số int 1:");
		int a = ScannerUltis.inputInt();
		System.out.println("Nhập vào số int 2:");
		int b = ScannerUltis.inputInt();
		System.out.println("Max a và b: " + MyMath.max(a, b));
		System.out.println("Min a và b: " + MyMath.min(a, b));
		System.out.println("Sum a và b: " + MyMath.sum(a, b));

	}

	public void question4() {
		System.err.println(" Set get collect");
		Student st = new Student();
		System.out.println("Collect là: " + st.getCollect());
		System.out.println("Thay đổi Collect: Đại học Hà Nội");
		st.SetCollect("Đại học Hà Nội");
		System.out.println("Collect là: " + st.getCollect());
	}

	public void question5() {

		System.out.println("Sử dụng For để tạo sinh viên: ");
		for (int i = 0; i < 3; i++) {
			System.out.println("Sinh viên " + (i + 1) + ":");
			Student st = new Student();
		}
		System.out.println("Sử dụng hàm khởi tạo để tạo sinh viên");
		Student st2 = new Student();
		Student st3 = new Student();
		System.out.println("Số sinh viên được tạo ra trên hệ thống là: " + Student.COUNT);
	}

	public void question6() {
		System.out.println("Tạo 2 Primary Student: ");
		PrimaryStudent pSt1 = new PrimaryStudent();
		PrimaryStudent pSt2 = new PrimaryStudent();
		System.out.println("Tạo 4 Secondary Student: ");
		SecondaryStudent sST1 = new SecondaryStudent();
		SecondaryStudent sST2 = new SecondaryStudent();
		SecondaryStudent sST3 = new SecondaryStudent();
		SecondaryStudent sST4 = new SecondaryStudent();

		System.out.println("Thông tin số lượng sinh viên");
		System.out.println("Student" + (Student.COUNT));
		System.out.println("PrimaryStudent" + PrimaryStudent.COUNTPri);

		System.out.println("SecondaryStudent" + SecondaryStudent.COUNTSecond);
	}

	public void question7() {

		for (int i = 0; i < 6; i++) {
			Student st = new Student();
		}
		System.out.println("Tạo Primary Student: ");
		PrimaryStudent pSt = new PrimaryStudent();
		System.out.println("Sinh viên Primary Student: " + pSt);
		System.out.println("Tạo Secondary Student: ");
		SecondaryStudent sSt = new SecondaryStudent();
		System.out.println("Sinh viên Secondary Student: " + sSt);
	}

}