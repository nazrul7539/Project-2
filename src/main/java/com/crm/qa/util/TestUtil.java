package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 30;
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Shohagh\\workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\PntTestData.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	
	public void switchToFrame(){
		driver.switchTo().frame("frameNamewill be here");
		
	}
	
}
