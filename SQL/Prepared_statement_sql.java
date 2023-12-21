package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepared_statement_sql {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		Class.forName(driver);
		
		Connection conn=DriverManager.getConnection(url, username, password);
		String str="insert into student values (?,?,?,?)";
		
		PreparedStatement ps= conn.prepareStatement(str);
		ps.setInt(1,101);
		ps.setString(2,"Nikita");
		ps.setString(3, "nikita@gmail");
		ps.setInt(4, 98654);
		
		ps.setInt(1,102);
		ps.setString(2,"Nia");
		ps.setString(3, "nia@gmail");
		ps.setInt(4, 9865233);
		
		ps.setInt(1,103);
		ps.setString(2,"muskan");
		ps.setString(3, "muskan@gmail");
		ps.setInt(4, 98652543);
		
		int row = ps.executeUpdate();
		System.out.println("row inserted");
	}

}
