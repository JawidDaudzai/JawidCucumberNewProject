package com.hrms.practiceSQL;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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

public class DatabaseTestAutomation {

	public static String username = "syntax_hrm";
	public static String password = "syntaxhrm123";
	// jdbc:driver//hostname:port/dbname
	public static String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	// @Test
	public void creatingConnection() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("connection is created");
		Statement st = conn.createStatement();
		ResultSet result = st.executeQuery("select * from hs_hr_employees");

		result.next();
		String name = result.getString("emp_firstname");
		System.out.println(name);
		String allName;

		while (result.next()) {
			allName = result.getObject("emp_firstname").toString();
			System.out.println(allName);
		}

	}

	// @Test
	public void getAllJobTitle() throws SQLException {

		Connection conn2 = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Second connection is made");
		DatabaseMetaData mData = conn2.getMetaData();
		int version = mData.getDatabaseMajorVersion();
		String productName = mData.getDatabaseProductName();
		System.out.println(version);
		System.out.println(productName);

		Statement st2 = conn2.createStatement();
		ResultSet re2 = st2.executeQuery("select job_title from ohrm_job_title");

		ArrayList<String> list = new ArrayList<>();

		while (re2.next()) {

			String allJobs = re2.getObject("job_title").toString();
			list.add(allJobs);
		}
		System.out.println(list);

	}

	@Test
	public void getAllDataUsingListOfMap() throws SQLException {

		Connection conn3 = DriverManager.getConnection(dbUrl, username, password);
		Statement st3 = conn3.createStatement();
		ResultSet rs3 = st3.executeQuery("select name from ohrm_skill");
		ResultSetMetaData rsMetaData3 = rs3.getMetaData();

		List<Map<String, String>> MapList = new ArrayList<>();

		Map<String, String> map;

		while (rs3.next()) {

			map = new LinkedHashMap<>();
			for (int x = 1; x <= rsMetaData3.getColumnCount(); x++) {

				String key = rsMetaData3.getColumnName(x);
				String value = rs3.getObject(x).toString();

				map.put(key, value);

			}
			MapList.add(map);

		}
		System.out.println(MapList);

	}
	
}
