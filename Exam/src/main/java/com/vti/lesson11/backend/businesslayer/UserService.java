package com.vti.lesson11.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import com.vti.lesson11.backend.datalayer.IUserRepository;
import com.vti.lesson11.backend.datalayer.UserRepository;
import com.vti.lesson11.entity.Manager;
import com.vti.lesson11.entity.User;

public class UserService  implements IUserService {
	private IUserRepository userRepository;
	public UserService() throws FileNotFoundException, IOException {
		userRepository = new UserRepository();
	}

	@Override
	public List<Manager> getListUsers()
			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		return userRepository.getAllManagers();
		
	}

}
