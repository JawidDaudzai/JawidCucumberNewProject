package com.hrms.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelFileReading {
	
	public static String ExcelPath = "C:\\Users\\User\\eclipse-workspace\\ZJawidCucumberNewProject2\\src\\test\\resources\\testdata\\PracticeExcelFile.xlsx";
	public static String sheetName = "JawidSheet";

	public static List<Map<String, String>> list() throws IOException {

		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> listMap = new ArrayList<>();
		Map<String, String> map;

		for (int x = 1; x < rows; x++) {

			map = new LinkedHashMap<>();

			for (int i = 0; i < columns; i++) {

				String key = sheet.getRow(0).getCell(i).toString();

				String value = sheet.getRow(x).getCell(i).toString();

				map.put(key, value);

			}
			listMap.add(map);

		}

		return listMap;

	}

}
