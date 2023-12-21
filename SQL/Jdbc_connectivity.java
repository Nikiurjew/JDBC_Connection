package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class Jdbc_connectivity {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url="jdbc:mysql://localhost:3306/jdbc";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,username,password);
		Statement st = conn.createStatement();
		String q1="select * from Student";
		ResultSet rs= st.executeQuery(q1);
		
		System.out.println("successfully connected");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
		}
	}

}
