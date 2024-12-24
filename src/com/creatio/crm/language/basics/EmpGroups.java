package com.creatio.crm.language.basics;

public class EmpGroups extends Employees {
	
	//EmpGroups class  inherits the properties of class Employee using extends key
	
	public static void main(String[] args) {
		
		EmpGroups obj = new EmpGroups();
		
		// two arrays are created for String , integer and data are stored from Employees class.
		
		String [] names = new String [3];
		names[0] =obj.empName1;
		names[1] =obj.empName2;
		names[2] =obj.empName3;
		
		int [] ids = new int [3];
		
		ids[0]= obj.empId1;
		ids[1]= obj.empId2;
		ids[2]= obj.empId2;
		
    //Retrieving the data from the Employees class, stored it in these arrays, and finally print each employee's name along with their corresponding ID.
		
		System.out.println("Employee Name:" +names[0]+",Employee ID :"+ids[0]);
		System.out.println("Employee Name:" +names[1]+",Employee ID :"+ids[1]);
		System.out.println("Employee Name:" +names[2]+",Employee ID :"+ids[2]);
		// Another way of printing similar data by using arrays stored in Employees class
		
		System.out.println("Employee Name:" +obj.employeeNames[0]+",Employee ID :"+obj.employeeIds[0]);

	}

}
