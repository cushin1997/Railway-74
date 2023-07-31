package com.vti.lesson11.fontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;


import com.vti.lesson11.database.UserFucntion;
import com.vti.lesson11.utils.ScannerUtils;

public class Demo1 {
	public static void main(String[] args) throws Exception {

		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("| ==========================| Choose please |==============================|%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Quản lý nhân viên User .");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUtils.inputIntPositive()) {
			case 1:
				getMenuAccount();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

	private static void getMenuAccount() throws Exception {
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("| Choose please |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Read data – get list User");

			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUtils.inputIntPositive()) {
			case 1:
				UserFucntion.getListManagerUser();
				break;
			case 2:
				System.out.println("rong ");
				break;

			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}
}
