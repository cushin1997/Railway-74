package com.vti.lesson11.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	private Connection connection;

	// Tạo connection
	public Connection getConnection() throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("resource/database.properties"));
		String url = pro.getProperty("url");
		String password = pro.getProperty("password");
		String username = pro.getProperty("username");
		String driver = pro.getProperty("driver");

		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		return connection;

	}

	public void disconnect() throws SQLException {

		if (connection != null) {
			connection.close();
		}
	}
	public ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Connection connnection = getConnection();
		Statement statement = connnection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		return result;
		}
		public PreparedStatement createPrepareStatement(String sql) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Connection connnection = getConnection();
		PreparedStatement preStatement = connnection.prepareStatement(sql);
		return preStatement;
		}
//	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
//		JDBCUtils jd = new JDBCUtils();
//		jd.getConnection();
}
