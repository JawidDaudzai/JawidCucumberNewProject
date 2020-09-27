package com.hrms.testbase;


import com.hrms.pages.HrmLoginPageElements;

public class PagesInitializer extends BaseClass{
 
	public static HrmLoginPageElements login;
	
 
 
 
	public static void intialize() {
		
		 login=new HrmLoginPageElements();	
		 
	}
}
