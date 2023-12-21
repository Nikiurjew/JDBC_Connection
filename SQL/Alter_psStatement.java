package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Alter_psStatement {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		Class.forName(driver);
		
		Connection conn=DriverManager.getConnection(url, username, password);
//		Statement st = conn.createStatement();
//		String str="alter table student add course varchar(20)";
//		int rows=st.executeUpdate(str);
//		System.out.println("rows affected"+rows);
		
		String str="alter table student add course varchar(20)";
		PreparedStatement ps= conn.prepareStatement(str);
		
		
		
		int row = ps.executeUpdate();
		System.out.println("row updated"+row);

		
		
		
		

	}

}
