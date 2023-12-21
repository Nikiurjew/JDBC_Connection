package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_psStatement {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		Class.forName(driver);
		
		Connection conn=DriverManager.getConnection(url, username, password);
		//String str="update student set name=? where id=?";
		String str="update student set id=? where name=?";
		
		PreparedStatement ps= conn.prepareStatement(str);
		
		ps.setInt(1,104);
		ps.setString(2, "Niki");
		
		
		
		int row = ps.executeUpdate();
		System.out.println("row updated"+row);


	}

}
