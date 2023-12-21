package com.jdbcconnector.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector_sql_demo1 {

	public static void main(String[] args) throws Exception {
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="Nikita@12";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		Class.forName(driver);
		Connection conn=DriverManager.getConnection(url, username, password);
		Statement st= conn.createStatement();
		String q1 ="insert into student values(105,'riya','riya@gmail.com',89753)";
		int rows=st.executeUpdate(q1);
		System.out.println("rows affected"+rows);
		String q2="update student set name='shivani' where id=122";
		int row=st.executeUpdate(q2);
		System.out.println("row updated"+row);
		String q3="delete from student where id=145";
		int row1=st.executeUpdate(q3);
		System.out.println("row deleted"+row1);
		
		String q4="select * from Student";
		ResultSet rs= st.executeQuery(q4);
		
		System.out.println("successfully connected");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
		}
		
	}

}
