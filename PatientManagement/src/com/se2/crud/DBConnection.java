package com.se2.crud;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	public static void main(String[] args) {
			DBConnection con=new DBConnection();
			System.out.println(con.get_connection());
	}
	public Connection get_connection(){
			Connection connection=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");              
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientmanagement","root", "root");
			} catch (Exception e) {
				System.out.println(e);
			}
			return connection;
	}
}