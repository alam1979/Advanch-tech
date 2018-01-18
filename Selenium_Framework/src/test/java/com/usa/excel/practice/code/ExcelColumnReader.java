package com.usa.excel.practice.code;

import java.util.ArrayList;

import com.usa.excelfactory.ExcelFactory;

public class ExcelColumnReader {
	static ArrayList<String> exceldataTableColumn;
	public static void main(String[] args) throws Throwable {
		String path="./ApplTestData/DataExtract.xlsx";


		exceldataTableColumn=new ArrayList<String> ();
		exceldataTableColumn=ExcelFactory.columnValue(0, 1, path);
		System.out.println(exceldataTableColumn);
	}

}