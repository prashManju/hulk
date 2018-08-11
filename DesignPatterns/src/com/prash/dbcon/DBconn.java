package com.prash.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconn {
	
	Connection con = null;
	ResultSet rs = null;
	
	public DBconn() {
		
	}
	
	public void getDbconn() {
		
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pwd = "root";
		String query = "select * from login";
		
		try {
			System.out.println("check it --");
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pwd);
			Statement st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println("Result Set " + rs.toString());
			}
			
			
		}catch(Exception ae) {
			ae.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {
		return "DBconn [rs=" + rs + "]";
	}

	public static void main(String a[]) {
		
		DBconn dbobj = new DBconn();
		dbobj.getDbconn();
	}

}
