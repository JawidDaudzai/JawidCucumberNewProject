package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo {
	
	
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	
	            //jdbc:driver type://hostname:port/db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
//	@Test
//	public void abc() throws SQLException {
//		
//		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//		
//		
//		System.out.println("DB connection is successful");
//		
//		Statement st= conn.createStatement();
//		//st.executeQuery("select * from hs_hr_employees");
//		ResultSet rs = st.executeQuery("select * from hs_hr_employees");
//		rs.next();
//		String firstname = rs.getString("emp_firstname");
//		System.out.println(firstname);
//		
//		
//		rs.next();
//		String firstname2 = rs.getObject("emp_firstname").toString();
//		System.out.println(firstname2);
//		String allData;
//		while(rs.next()) {
//			allData= rs.getObject("emp_firstname").toString();
//			System.out.println(allData);
//		}
//		
//		
//		rs.close();
//		st.close();
//		conn.close();
//		
//		
//	}
	
	@Test
	public void abcd() throws SQLException {
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		
		System.out.println("DB connection is successful");
		
		Statement st= conn.createStatement();
		
		
		//String sqlQuery= "select job_title from ohrm_job_title where job_title =is_deleted order by job_title";
		
		ResultSet rs = st.executeQuery("select job_title from ohrm_job_title where job_title =is_deleted order by job_title");
		
		//ResultSet rs = st.executeQuery("select * from ohrm_job_title");
		
		List<String> jobTitle = new ArrayList<>();
	
		while(rs.next()) {
			jobTitle.add(rs.getObject("job_title").toString());
			
		}
		for (String jt : jobTitle) {
				System.out.println(jt);
		}
	
		
		rs.close();
		st.close();
		conn.close();
	
	}
}
