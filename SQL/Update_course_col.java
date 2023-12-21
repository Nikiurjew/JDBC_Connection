package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_course_col {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		Class.forName(driver);
		
		Connection conn=DriverManager.getConnection(url, username, password);
	
		String str1="update student set course=? where id=?";
		
		PreparedStatement ps= conn.prepareStatement(str1);
		
		ps.setInt(2,104);
		ps.setString(1, "CSR");
		ps.setString(1, "Java");
		ps.setInt(2,102);
		
		ps.setInt(2,101);
		ps.setString(1, "full Stack");
		
		
		
		
		int row = ps.executeUpdate();
		System.out.println("row updated"+row);

	}

}
