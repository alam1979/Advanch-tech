package com.usa.sql.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import com.usa.sql.helper.util.DBTablePrinter;


public class DataTableColumnFactory {

	public static ResultSet getDataTableColumn(String SQLqyeries) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery(SQLqyeries);
		
		  ArrayList<String> salary = new ArrayList<String>();
		  
		  while(rs.next())
		  { 
		 System.out.println(rs.getInt(1));
		  salary.add( rs.getString("SALARY")); }
		// step5 close the connection object
		connection.close();
		return rs;

	}}

