package com.se2.crud;

import java.sql.Connection;
//import java.sql.String;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientsCrud {

	public void insert(int registration_no, String patient_name, String dob, String gender, String blood_group,
			String address, String phone) {
		DBConnection con = new DBConnection();
		Connection connection = con.get_connection();
		PreparedStatement ps = null;
		try {
			String query = "insert into patients(registration_no,patient_name,dob,gender,blood_group,address,phone) values (?,?,?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			System.out.println("Enter Registration Number");
			ps.setInt(1, registration_no);
			System.out.println("Enter Patient Name");
			ps.setString(2, patient_name);
			System.out.println("Enter Date of Birth");
			ps.setString(3, dob);
			System.out.println("Enter Gender");
			ps.setString(4, gender);
			System.out.println("Enter Blood Group");
			ps.setString(5, blood_group);
			System.out.println("Enter Address");
			ps.setString(6, address);
			System.out.println("Enter Mobile Number");
			ps.setString(7, phone);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void read() {
		DBConnection con = new DBConnection();
		Connection connection = con.get_connection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String query = "select * from patients";
			ps = connection.prepareStatement(query);
			System.out.println(ps);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Registration no -" + rs.getInt("registration_no"));
				System.out.println("Patient name -" + rs.getString("patient_name"));
				System.out.println("DOB -" + rs.getString("dob"));
				System.out.println("Gender -" + rs.getString("gender"));
				System.out.println("Blood Group -" + rs.getString("blood_group"));
				System.out.println("Address -" + rs.getString("address"));
				System.out.println("Number -" + rs.getString("phone"));
				System.out.println("---------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void readbyid(int registration_no) {
		DBConnection con = new DBConnection();
		Connection connection = con.get_connection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String query = "select * from patients where registration_no=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, registration_no);
			System.out.println(ps);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Registration no -" + rs.getInt("registration_no"));
				System.out.println("Patient name -" + rs.getString("patient_name"));
				System.out.println("DOB -" + rs.getString("dob"));
				System.out.println("Gender -" + rs.getString("gender"));
				System.out.println("Blood Group -" + rs.getString("blood_group"));
				System.out.println("Address -" + rs.getString("address"));
				System.out.println("Number -" + rs.getString("phone"));
				System.out.println("---------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update(int new_registration_no, String patient_name, String dob, String gender, String blood_group,
			String address, String phone, int registration_no) {
		DBConnection con = new DBConnection();
		Connection connection = con.get_connection();
		PreparedStatement ps = null;
		try {
			String query = "update patients set registration_no=?,patient_name=?,dob=?,gender=?,blood_group=?,address=?,phone=? where registration_no=?";
			ps = connection.prepareStatement(query);
			System.out.println("Enter Registration Number");
			ps.setInt(1, new_registration_no);
			System.out.println("Enter Patient Name");
			ps.setString(2, patient_name);
			System.out.println("Enter Date of Birth");
			ps.setString(3, dob);
			System.out.println("Enter Gender");
			ps.setString(4, gender);
			System.out.println("Enter Blood Group");
			ps.setString(5, blood_group);
			System.out.println("Enter Address");
			ps.setString(6, address);
			System.out.println("Enter Mobile Number");
			ps.setString(7, phone);
			System.out.println(ps);
			ps.setInt(8, registration_no);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void delete(int registration_no) {
		DBConnection con = new DBConnection();
		Connection connection = con.get_connection();
		PreparedStatement ps = null;
		try {
			String query = "delete from patients where registration_no=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, registration_no);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}