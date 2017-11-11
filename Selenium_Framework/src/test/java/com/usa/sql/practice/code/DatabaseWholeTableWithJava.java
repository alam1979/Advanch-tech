package com.usa.sql.practice.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import com.usa.sql.helper.util.DBTablePrinter;

public class DatabaseWholeTableWithJava {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/orcl", "hr", "hr");
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
			ResultSet rs = stmt.executeQuery(
		 "Select * From employees");
			ResultSetMetaData rsmd = rs.getMetaData();
		
			int columnsNumber = rsmd.getColumnCount();                     

			// Iterate through the data in the result set and display it. 
			ArrayList<String> columnValue = new ArrayList<String>();
			while (rs.next()) {
			//Print one row          
			for(int i = 1 ; i <= columnsNumber; i++){

			      System.out.print(rs.getString(i) + " "); //Print one element of a row
			      columnValue.add(rs.getString(i) );
			}

			  System.out.println();//Move to the next line to print the next row.           

			    }
		// step5 close the connection object
		connection.close();
		
	}

}

