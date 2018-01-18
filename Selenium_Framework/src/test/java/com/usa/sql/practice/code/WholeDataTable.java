package com.usa.sql.practice.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.usa.sql.helper.util.DBTablePrinter;

public class WholeDataTable {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
			
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");
		DBTablePrinter.printResultSet(rs);
		//step5 close the connection object
		connection.close();}}

