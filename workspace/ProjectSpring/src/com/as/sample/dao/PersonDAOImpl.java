package com.as.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.as.sample.vo.PersonVO;

@Repository("personVO")
public class PersonDAOImpl implements PersonDAO {

	public PersonDAOImpl() {
		super();
	}

	public static Connection getConnection() throws Exception {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/vaibhav";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return con;
	}

	public void insertInfoInDatabase(PersonVO personVO) {
		PreparedStatement pStmt;
		String sql = "INSERT INTO PERSONAL VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pStmt = getConnection().prepareStatement(sql);
			pStmt.setString(1, personVO.getFirstName());
			pStmt.setString(2, personVO.getMiddleName());
			pStmt.setString(3, personVO.getLastName());
			pStmt.setString(4, personVO.getGender());
			pStmt.setString(5, personVO.getAddress());
			pStmt.setString(6, personVO.getCity());
			pStmt.setString(7, personVO.getState());
			pStmt.setString(8, personVO.getCountry());
			pStmt.setInt(9, personVO.getPhone());
			pStmt.setString(10, personVO.getBank());
			pStmt.setInt(11, personVO.getActNo());
			pStmt.setInt(12, personVO.getSsn());

			int rowsInserted = pStmt.executeUpdate();
			System.out.println(rowsInserted);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
