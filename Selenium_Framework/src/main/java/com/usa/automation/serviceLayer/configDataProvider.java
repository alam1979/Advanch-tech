package com.usa.automation.serviceLayer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


    public class configDataProvider {
	
	FileInputStream fis;
	Properties pro;
	WebDriver driver;
	public configDataProvider(){
		
		
			//File class to locate excel
			File src =new File("./Configuration/config. properties");
		try {
			//input stream to read data
			fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}}
	
         public String getAppURL(){
		
		String AppURL=pro.getProperty("AppURL");
		return AppURL;	
	}

public String userName(){
	
	String UserName=pro.getProperty("UserName");
	return UserName;	
}
public String passWord(){
	
	String Password=pro.getProperty("Password");
	return Password;	
}

public String TestWebTableURL(){
	
	String testWebTableURL=pro.getProperty("TestWebTableURL");
	
	return testWebTableURL;	
}

public String getIEPath(){
		
		String IEPath=pro.getProperty("IEPath");
		return IEPath;	
	}
public String getChromePath(){
	
	String ChromePath=pro.getProperty("ChromePath");
	return ChromePath;	
}
public String getdbURL(){
	
	String dbURL=pro.getProperty("dbURL");
	return dbURL;	
}	
	
public String getdbuname(){
	
	String dbuname=pro.getProperty("dbuname");
	return dbuname;	
}
public String getdbpass(){
	
	String dbpass=pro.getProperty("dbpass");
	return dbpass;	
}
public String getquery1(){
	
	String query1=pro.getProperty("query1");
	return query1;	
}
public String getquery2(){
	
	String query2=pro.getProperty("query2");
	return query2;	
}
public String getExcelPath(){
	
	String ExcelPath=pro.getProperty("ExcelPath");
	return ExcelPath;	
}}
