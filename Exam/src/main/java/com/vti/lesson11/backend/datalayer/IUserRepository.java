package com.vti.lesson11.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.entity.Manager;
import com.vti.lesson11.entity.User;



public interface IUserRepository {


	List<Manager> getAllManagers() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException;

}
