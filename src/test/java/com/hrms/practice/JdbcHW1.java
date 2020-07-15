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

public class JdbcHW1 {
	static String dbUsername = "syntax_hrm";
	static String dbPassword = "syntaxhrm123";
	static String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void jdbcHM() throws SQLException {

		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		System.out.println("Database Connection is made");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_emp_emergency_contacts");
		ResultSetMetaData mResult = rs.getMetaData();

		String tableName = mResult.getTableName(4);
		String tableType = mResult.getColumnTypeName(4);
		System.out.println(tableName);
		System.out.println(tableType);

		List<String> relationshipType = new ArrayList<>();

		while (rs.next()) {
			relationshipType.add(rs.getObject("eec_relationship").toString());
		}
		for (String Relation : relationshipType) {
			System.out.println(Relation);
		}

		rs.close();
		st.close();
		con.close();
	}
	
	
	@Test
	public void ClassTask() throws SQLException {
		
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st=conn.createStatement();
		ResultSet rs=  st.executeQuery("select id, name from ohrm_nationality");
		ResultSetMetaData mresult =	rs.getMetaData();
		List<Map<String, String>> listData = new ArrayList<>();
		
		Map<String, String> map;
		
		while(rs.next()) {
			map= new LinkedHashMap<>();
			map.put("Nationality id", rs.getObject("id").toString());
			map.put("Nationality", rs.getObject("name").toString());
		
			listData.add(map);
		}
		System.out.println(listData);
				
				
				
			
		
	}
}
