package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_preparedStatement {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		Class.forName(driver);
		
		Connection conn=DriverManager.getConnection(url, username, password);
		String str="delete from student where id=?";
		
		PreparedStatement ps= conn.prepareStatement(str);
		
		ps.setInt(1,107);
		
		
		
		int row = ps.executeUpdate();
		System.out.println("row deleted"+row);

	}

}
