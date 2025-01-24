package com.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CollectionExcelAssignment {

	public static List<Map<String, Object>> readExcelData(String filename, String Sheetname) {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + filename); // read
																													// the
																													// file
			XSSFWorkbook workbook = new XSSFWorkbook(file);// share the file with excel classes
			XSSFSheet sheet = workbook.getSheet(Sheetname);// get the sheet to read data
			int totalRows = sheet.getPhysicalNumberOfRows(); // total number of rows having data
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells(); // total number of columns having data in
																			// specific row
			// data = new String [totalRows-1][totalColumns];
			for (int r = 1; r < totalRows; r++) {
				Map<String, Object> rowData = new HashMap<String, Object>();
				for (int c = 0; c < totalColumns; c++) {
					String columnName = sheet.getRow(0).getCell(c).getStringCellValue();
					DataFormatter formatter = new DataFormatter();
					Object columnValues = formatter.formatCellValue(sheet.getRow(r).getCell(c));
					// String columnValues =sheet.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnValues);
				}
				data.add(rowData);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

	public static List<Map<String, Object>> readExcelData1(String filename, String Sheetname) {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + filename); // read
																													// the
																													// file
			XSSFWorkbook workbook = new XSSFWorkbook(file);// share the file with excel classes
			XSSFSheet sheet = workbook.getSheet(Sheetname);// get the sheet to read data
			int totalRows = sheet.getPhysicalNumberOfRows(); // total number of rows having data
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells(); // total number of columns having data in
																			// specific row
			// data = new String [totalRows-1][totalColumns];
			for (int r = 1; r < totalRows; r++) {
				Map<String, Object> rowData = new HashMap<String, Object>();
				for (int c = 0; c < totalColumns; c++) {
					String columnName = sheet.getRow(0).getCell(c).getStringCellValue();
					DataFormatter formatter = new DataFormatter();
					Object columnValues = formatter.formatCellValue(sheet.getRow(r).getCell(c));
					// String columnValues =sheet.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnValues);
				}
				data.add(rowData);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

	public static List<Map<String, Object>> readExcelData2(String filename, String Sheetname) {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + filename); // read
																													// the
																													// file
			XSSFWorkbook workbook = new XSSFWorkbook(file);// share the file with excel classes
			XSSFSheet sheet = workbook.getSheet(Sheetname);// get the sheet to read data
			int totalRows = sheet.getPhysicalNumberOfRows(); // total number of rows having data
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells(); // total number of columns having data in
																			// specific row
			// data = new String [totalRows-1][totalColumns];
			for (int r = 1; r < totalRows; r++) {
				Map<String, Object> rowData = new HashMap<String, Object>();
				for (int c = 0; c < totalColumns; c++) {
					String columnName = sheet.getRow(0).getCell(c).getStringCellValue();
					DataFormatter formatter = new DataFormatter();
					Object columnValues = formatter.formatCellValue(sheet.getRow(r).getCell(c));
					// String columnValues =sheet.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnValues);
				}
				data.add(rowData);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}
}