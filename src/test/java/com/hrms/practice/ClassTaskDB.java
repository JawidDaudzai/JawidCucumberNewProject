package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;



public class ClassTaskDB {

	static String dbUsername = "syntax_hrm";
	static String dbPassword = "syntaxhrm123";
	static String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	static Connection conn;
	static Statement st;
	static ResultSet rs;
	static ResultSetMetaData reMetaData;
	
	
@Test
	public void classTask() throws SQLException {
		
		conn= DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("Connection is made");
		
		
		
	try {
		st=	conn.createStatement();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
	rs=st.executeQuery("select id, name, country_code from ohrm_location");
		
		
		try {
			 reMetaData= rs.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int colNum= reMetaData.getColumnCount();
		for (int i=1; i<=colNum; i++) {
		String colName=	reMetaData.getColumnName(i).toString();
			
			System.out.println(colName);
		}
		
		
List<Map<String, String>> listData = new ArrayList<>();
		
		Map<String, String> map;
		
//		while(rs.next()) {
//			map= new LinkedHashMap<>();
//			map.put("Jawid", rs.getObject("id").toString());
//			map.put("Jawid2", rs.getObject("name").toString());
//			map.put("Jawid3", rs.getObject("country_code").toString());
//			listData.add(map);
//		}
//		System.out.println(listData);
		
		
		
		while(rs.next()) {
			
			map= new LinkedHashMap<>();
			for (int i=1; i<=colNum; i++) {
				map.put(reMetaData.getColumnName(i), rs.getObject(i).toString());
	
			}
			listData.add(map);
		}
		System.out.println(listData);
	}
	
	
}
