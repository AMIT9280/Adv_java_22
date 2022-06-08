package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
		public static Connection getConnection() {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/advjavaavangers";
			String userName = "root";
			String password = "root";
			
			
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url,userName,password);
				if (con==null) {
					System.out.println("Db not Connected...");
				}else {
					
					System.out.println("Db Connected...");
					return con;
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
}
