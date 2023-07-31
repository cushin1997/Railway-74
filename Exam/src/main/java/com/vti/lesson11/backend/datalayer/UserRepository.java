package com.vti.lesson11.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.lesson11.entity.Employee;
import com.vti.lesson11.entity.Manager;
import com.vti.lesson11.entity.User;
import com.vti.lesson11.utils.JDBCUtils;

public class UserRepository implements IUserRepository {
	private JDBCUtils jdbc = new JDBCUtils();

	public UserRepository() throws FileNotFoundException, IOException {
		jdbc = new JDBCUtils();
	}

	@Override
	public List<Manager> getAllManagers()
			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		String sql = "SELECT * FROM User WHERE role = 'manager'";
		ResultSet resultSet = jdbc.executeQuery(sql);
		List<Manager> listUser = new ArrayList<Manager>();
		while (resultSet.next()) {
			User user = new User();
			user.setFullName(resultSet.getString(1));
			user.setEmail(resultSet.getString(2));
			user.setId(resultSet.getInt(3));
			user.setPassword(resultSet.getString(4));
			Manager mana =  new Manager(resultSet.getInt(5)) ;
			user.setManager(mana);
			Employee empl = new Employee (resultSet.getString(6));
            user.setEmployee(empl);
		}

		return listUser;
	}
}
