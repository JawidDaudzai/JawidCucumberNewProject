package com.hrms.testbase;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.HrmEmpAddPageElements;
import com.hrms.pages.HrmLoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.QualificationsPageElements;
import com.hrms.pages.ViewEmployeePageElements;

public class PagesInitializer extends BaseClass{
 
	public static HrmLoginPageElements login;
	public static PersonalDetailsPageElements pdetails;
	public static DashboardPageElements dashboard;
	public static HrmEmpAddPageElements addEmp;
	public static ViewEmployeePageElements viewEmp;
	public static QualificationsPageElements viewQual;
 
 
 
	public static void intialize() {
		
		 login=new HrmLoginPageElements();	
		 pdetails= new PersonalDetailsPageElements();
		dashboard= new DashboardPageElements();
		addEmp= new HrmEmpAddPageElements();
		viewEmp=new ViewEmployeePageElements();
		viewQual= new QualificationsPageElements();
	}
}
