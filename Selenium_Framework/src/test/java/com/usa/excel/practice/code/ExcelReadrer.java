package com.usa.excel.practice.code;

import java.util.ArrayList;

import com.usa.excelfactory.ExcelFactory;

public class ExcelReadrer {
	static ArrayList<String> exceldataTable;
	public static void main(String[] args) throws Throwable {
		
		String path="./ApplTestData/DataExtract.xlsx";

		exceldataTable= new ArrayList<String> ();
		exceldataTable=ExcelFactory.wholeExcelValue(0, path);
		System.out.println(exceldataTable);
	    }}
