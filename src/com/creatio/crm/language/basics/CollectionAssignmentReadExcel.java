package com.framework.utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionAssignmentReadExcel {

	public static void main(String[] args) {


		// Read Excel into List
		List<Map<String, Object>> readExcelData = CollectionExcelAssignment.readExcelData("CollectionsAssignment.xlsx", "StudentDetails");
		System.out.println(readExcelData.get(0).get("Age"));
		List<Map<String, Object>> readExcelData1 = CollectionExcelAssignment.readExcelData("CollectionsAssignment.xlsx", "EmployeeDetails");
		System.out.println(readExcelData1.get(0).get("Salary"));
		List<Map<String, Object>> readExcelData2 = CollectionExcelAssignment.readExcelData("CollectionsAssignment.xlsx", "ProductDetails");
		System.out.println(readExcelData2.get(0).get("Price"));
		Map<String, List<Map<String, Object>>> data = new HashMap<String, List<Map<String, Object>>>();
		data.put("StudentData", readExcelData);
		data.put("EmployeeData", readExcelData1);
		data.put("ProductData", readExcelData2);
		for (Entry<String, List<Map<String, Object>>> entry : data.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("All Data List :" + data);
		System.out.println("\n\nDisplaying Supplier Name of 2nd row ProductData: "
				+ data.get("ProductData").get(1).get("Supplier"));
	}
}
