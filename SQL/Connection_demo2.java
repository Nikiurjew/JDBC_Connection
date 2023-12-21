package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection_demo2 {

	public static void main(String[] args) throws Exception  {
		String driver = "com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url="jdbc:mysql://localhost:3306/jdbc";
		Class.forName(driver);
		Connection conn= DriverManager.getConnection(url, username, password);
		Statement st=conn.createStatement();
		String q1="insert into student values(102,'niki','niki@gmail.com',89765)";
		int rows=st.executeUpdate(q1);
		
		System.out.println("rows affected"+rows);

	}

}
