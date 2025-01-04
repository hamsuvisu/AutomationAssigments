package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment8CollectionsHike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		double []baseSalaries = {75000, 68000, 82000, 90000, 60000};
		int []exps= {5, 3, 7, 10, 2};
		double[] ratings= {4.2, 3.8, 4.5, 2.0, 3.5};
		

		 Map<String,Double> empHikePercent = new HashMap<>();
		
		for (int i=0;i<names.length;i++)
		{
		String name =names[i];
		double baseSalary=baseSalaries[i];
		int exp=exps[i];
		double rating=ratings[i];
		
		//Rating condition , variable pay , Bonus declaration
		int variablePay ;
		int bonus;
		int reward;
		 if (rating>=4) {
			 variablePay=15;
			 bonus=1500;
		 }
		 else if(rating>=3 && rating< 4) {
			 variablePay=10;
			 bonus=1200;
		 }
		 else if(rating<3) {
			 
			 variablePay=3;
			 bonus=300;
			 }
		 else
		 {
			 variablePay=0;
			 bonus=0;
		 }
		 // Another method with Ternary  to check if condition
		// reward =  exp>=5? 5000:0; // Another method with Ternary  int reward=  exp >=5?0;

		 
		 //Extra Perks
		 //Employees with Experience >= 5 Years get extra Reward of 5000;
		if (exp>=5) 
			 reward=5000;
		 else 
			 reward=0;
		 //Hike calculation
		 
		 double hike ;
		 hike =(baseSalary*variablePay/100)+bonus+reward;
		 double hikepercentage;
		 hikepercentage = (hike/baseSalary)*100;
		 
		
		 empHikePercent.put(name, hikepercentage);
		}
		
		for(Map.Entry<String,Double> entry: empHikePercent.entrySet() )
		{
			System.out.println(entry.getKey() + ": " + entry.getValue()+"%" );
		}
	}
}
			
		 
		 
		 
		 
		

