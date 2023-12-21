package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Multiple_datainsert {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		Class.forName(driver);
		Connection conn=DriverManager.getConnection(url, username, password);
		Statement st= conn.createStatement();
		String q1 ="insert into student values(106,'ria','ria@gmail.com',897523)";
		int rows=st.executeUpdate(q1);
		System.out.println("rows affected"+rows);
		
		String q2 ="insert into student values(106,'nitu','nitu@gmail.com',8345523)";
		int row1=st.executeUpdate(q2);
		System.out.println("rows affected"+row1);

	}

}
