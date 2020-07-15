package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {

	
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	
	//jdbc:driver type:hostname:port/de name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void dbMetadat() throws SQLException {
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		DatabaseMetaData dbMetaData = conn.getMetaData();
		String driverName=dbMetaData.getDriverName();
		String dbVersion =dbMetaData.getDatabaseProductVersion();
		
		System.out.println(driverName);
		System.out.println(dbVersion);
		
		
	}
	@Test
	public void rsMetadat() throws SQLException {
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
				ResultSet rs= st.executeQuery("select * from ohrm_skill");
		
		
		ResultSetMetaData rsMetadata= rs.getMetaData();
		
		int colNumbers = rsMetadata.getColumnCount();
		
		System.out.println(colNumbers);
		
		String colName=rsMetadata.getColumnName(1);
		
		System.out.println(colName);
		
		for (int i=1; i<=colNumbers; i++) {
			String colNames=rsMetadata.getColumnName(i);
			System.out.println(colNames);
			
		}
		String id;
		String name;
		
		while (rs.next()) {
			
			id= rs.getObject("id").toString();
			name=rs.getObject("name").toString();
			
			System.out.println(id +" = "+name);
		}
		rs.close();
		st.close();
		conn.close();
	}
	
}
