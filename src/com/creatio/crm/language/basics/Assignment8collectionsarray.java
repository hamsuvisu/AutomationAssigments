package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment8collectionsarray {

	public static void main(String[] args) {
		
		  Double[] alicedata ={75000.0,5.0,4.2};
		  Double[] bobdata =  {68000.0,3.0,3.8};
		  Double[] davisdata ={82000.0,7.0,4.5};
		  Double[] browndata ={90000.0,10.0,2.0};
		  Double[] greendata ={60000.0,2.0,3.5};
		
				
				Map<String, Double[]> empData = new HashMap<String,Double[] >();
				 Map<String, Double> hikePercentages = new HashMap<>();
				empData.put("Alice Johnson", alicedata);
				empData.put("Bob Smith", bobdata);
				empData.put("Carol Davis", davisdata);
				empData.put("David Brown", browndata);
				empData.put("Eva Green", greendata);
				
				Set<String> keys =empData.keySet();
				
				for (String key : keys) {
				
					
					double rating =empData.get(key)[2];
					double exp=empData.get(key)[1];
					double baseSalary =empData.get(key)[0];
					double hike ;
					int variablePay;
					int bonus;
					int reward;
					double hikepercentage;

					
					//if (empData.get(key)[2]>=4)
					if(rating>=4)
					{
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
					if (exp>=5) 
						 reward=5000;
					 else 
						 reward=0;
					
					 //Hike calculation
					 
					  hike =(baseSalary*variablePay/100)+bonus+reward;
					 hikepercentage = (hike/baseSalary)*100;
					
					 hikePercentages.put(key, hikepercentage);
					 				 
				}
				for(Map.Entry<String,Double> entry: hikePercentages.entrySet() )
				{
					System.out.println(entry.getKey() + ": " + entry.getValue()+"%" );
				}
				

			}

		}
