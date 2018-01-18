package com.usa.excel.practice.code;

import com.usa.excelfactory.ExcelFactory;

public class ExcelCellData {

	
	    static String exceldataTableCell;
	    public static void main(String[] args) {
		String path="./ApplTestData/DataExtract.xlsx";
		exceldataTableCell=ExcelFactory.getCellData(0, 1, 1, path);
		System.out.println(exceldataTableCell);
		}}
