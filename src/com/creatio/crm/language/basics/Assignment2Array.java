package com.creatio.crm.language.basics;

public class Assignment2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] empname = new String [2];
		empname [0]= "hari";
		empname [1]= "rishu";
		
				
		
	String [] [] [] products = new String [2] [4] [5];
	products[0][0][0] = "Cola";
	products[0][0][1] = "Orange Juice"; 
	products[0][1][0] = "Popcorn";
	products[0][2][1] = "Heavy Cream";
	products[1][0][0] = "Cola";
	products[1][3][0] = "Apples";
	products[1][2][1] = "Heavy Cream";
	
	System.out.println(products[1][3][0]);
	
	String[][] data = {{"ABC","123"}, {"XYZ","234"},{"CDF","567"}};
	System.out.println(data[2][0]);
	}

}
