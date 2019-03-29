package com.as.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.as.bo.PersonProfileBean;

public class AddInformationInDatabaseDBAccess {

	public AddInformationInDatabaseDBAccess() {
		super();
	}

	public static Connection getConnection() throws Exception {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/vaibhav";
			Class.forName("com.mysql.jdbc.Driver");
			String user = "root";
			String password = "";
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaibhav", "root", "");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return con;
	}

	public static void insertInfoInDatabase(PersonProfileBean personProfileBean) {
		PreparedStatement pStmt;
		String sql = "INSERT INTO PERSONAL VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			pStmt = getConnection().prepareStatement(sql);
			pStmt.setString(1, personProfileBean.getFirstName());
			pStmt.setString(2, personProfileBean.getMiddleName());
			pStmt.setString(3, personProfileBean.getLastName());
			pStmt.setString(4, personProfileBean.getGender());
			pStmt.setString(5, personProfileBean.getAddress());
			pStmt.setString(6, personProfileBean.getCity());
			pStmt.setString(7, personProfileBean.getState());
			pStmt.setString(8, personProfileBean.getCountry());
			pStmt.setString(9, personProfileBean.getPhone());
			pStmt.setString(10, personProfileBean.getBank());
			pStmt.setString(11, personProfileBean.getActNo());
			pStmt.setString(12, personProfileBean.getSsn());

			int rowsInserted = pStmt.executeUpdate();
		}
		catch(Exception e){
		System.out.println(e);	
		}
	}

}
