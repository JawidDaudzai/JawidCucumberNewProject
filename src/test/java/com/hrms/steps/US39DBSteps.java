package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.hrms.utilis.DBUtils;

public class US39DBSteps {

	
	public static List<Map<String, String>> JobTitledbData;
@Test
public void getAllJobTitleFromDB() {
	
	
	String sqlQuery= "select job_title from ohrm_job_title where job_title =is_deleted order by job_title";
	
	JobTitledbData=DBUtils.storeDataFromDB(sqlQuery);
	
	
}
	
	
}

