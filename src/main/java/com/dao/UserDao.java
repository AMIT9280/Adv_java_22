package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.UserBean;

import com.util.DbConnection;

public class UserDao {

	public boolean insertUser(UserBean user) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");

			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());

			int i = pstmt.executeUpdate();
			if (i == 0) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public ArrayList<UserBean> getAllUser() {

		ArrayList<UserBean> users = new ArrayList<UserBean>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				UserBean userBean = new UserBean();
				userBean.setUserId(rs.getInt("userId"));
				userBean.setFirstName(rs.getNString("firstName"));
				userBean.setEmail(rs.getString("email"));
				String password = rs.getString("password");
				userBean.setPassword(password);

				users.add(userBean);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return users;
	}

	public boolean deleteUser(int userId) {
		Connection con = null;
		boolean flag = false;
		PreparedStatement pstmt = null;

		try {
			con = DbConnection.getConnection();
			pstmt = con.prepareStatement("delete from users where userId = ? ");
			pstmt.setInt(1, userId);

			int record = pstmt.executeUpdate();
			if (record != 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return flag;
	}

	public UserBean getUserById(int userId) {
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("Select * from users where userId = ?");) {
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			rs.next();

			UserBean user = new UserBean();

			user.setUserId(rs.getInt("userId"));
			user.setFirstName(rs.getString("firstName"));
			user.setEmail(rs.getString("email"));
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}  
	
	public boolean UpdateUser(UserBean user) {
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con
						.prepareStatement("update users set firstName= ?,email= ? where userId = ?");)
				{
						
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getEmail());
			pstmt.setInt(3, user.getUserId()); 
			 
			int i = pstmt.executeUpdate();
			if (i == 0) {
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return false;
	}

}
