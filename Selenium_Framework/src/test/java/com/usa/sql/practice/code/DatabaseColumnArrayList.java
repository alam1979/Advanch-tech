package com.usa.sql.practice.code;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.usa.sql.factory.DatabaseFactoryWholeTable;

public class DatabaseColumnArrayList {

	static ResultSet rs;
	public static void main(String[] args) throws Throwable {
		
		
		String SQLqyery="Select * From (select employee_id,first_name,last_name,salary, DENSE_RANK() over(ORDER BY salary desc) rank from employees) Where rank= 9";
		

		DatabaseFactoryWholeTable.getDatabaseColumnArrayList(SQLqyery, rs);
		
			/*ResultSet rs = stmt.executeQuery(
					"Select * From (select employee_id,first_name,last_name,salary, DENSE_RANK() over(ORDER BY salary desc) rank from employees) Where rank= 9");
			*/


  ArrayList<String> salary = new ArrayList<String>();
  
  while(rs.next()) { 
	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3) +" "+rs.getString(4)+" "+rs.getString(5));
 
  
  salary.add( rs.getString("SALARY")); }
  
  for(String rank:salary) {
	  System.out.println("Rank 9th salary is ::"+rank);
 if (rank.equalsIgnoreCase("11000")) { 
	 System.out.println("Test is Passed");
 
  } 
 else { 
	  System.out.println("Test Failed");
  
  } break; }
 
	}

}
