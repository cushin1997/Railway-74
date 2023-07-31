package com.vti.lesson11.database;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.backend.presentationlayer.UserController;
import com.vti.lesson11.entity.Manager;
import com.vti.lesson11.entity.User;



public class UserFucntion {
	public static void getListManagerUser()

			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		UserController userControler = new UserController();
		List<Manager> listUser1 = userControler.getListUsers();
		String leftAlignFormat = "| %-2d | %-21s | %-15s | %-21s | %-14s | %-16s | %-16s | %n";
		System.out.format("+----+-----------------------+-----------------+-----------------------+----------------+------------------+------------------+%n");
		System.out.format("|ID  |        FullName      |  Email       |     Pass     |%n");
		System.out.format("+----+-----------------------+-----------------+-----------------------+----------------+------------------+------------------+%n");
		for (User user : listUser1) {
			System.out.format(leftAlignFormat, user.getId(), user.getFullName(),user.getEmail(),user.getPassword());

		

		}
		System.out.format(
				"+----+-----------------------+-----------------+-----------------------+----------------+------------------+------------------+%n");
	}
}
