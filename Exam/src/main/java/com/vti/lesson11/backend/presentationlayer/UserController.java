package com.vti.lesson11.backend.presentationlayer;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.backend.businesslayer.IUserService;
import com.vti.lesson11.backend.businesslayer.UserService;
import com.vti.lesson11.entity.Manager;
import com.vti.lesson11.entity.User;


public class UserController {
	private IUserService userService;
	public UserController() throws FileNotFoundException, IOException {
		userService = new UserService();
}

	public List<Manager> getListUsers()

			throws FileNotFoundException, ClassNotFoundException, SQLException,

			IOException {

		return userService.getListUsers();

	}
}