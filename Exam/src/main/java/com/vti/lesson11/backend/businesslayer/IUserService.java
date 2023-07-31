package com.vti.lesson11.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.entity.Manager;
import com.vti.lesson11.entity.User;



public interface IUserService {
	public List<Manager> getListUsers()

			throws FileNotFoundException, ClassNotFoundException, SQLException,

			IOException;
}
