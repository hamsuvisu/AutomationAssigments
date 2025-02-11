package com.creatio.crm.language.basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*1. Create a list of the top 5 most populated countries in the world and print 2nd Country
2. Create a set of the top 10 most visited tourist attractions in the world and print out its
size.
3. Create a map of the 5 largest cities in the United States and their populations.
4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
on the list.
*/
public class Assignment5ArraysCollection {

	public static void main(String[] args) {
		
		// 1.Creating a List if Top 5 Most Populated Countries in the World
		
		System.out.println("*************** ArrayList ***************");
		List<String> topPopulatedCountries = new ArrayList<>();
		topPopulatedCountries.add("India");
		topPopulatedCountries.add("China");
		topPopulatedCountries.add("United States");
		topPopulatedCountries.add("Indonesia");
		topPopulatedCountries.add("Pakistan");
		System.out.println("Top 5 Most Populated Countries in the World");
		for (int i=0;i<topPopulatedCountries.size();i++) {
			
			System.out.println(topPopulatedCountries.get(i));
		}
		
		// Displaying second populated country from the given List.
		System.out.println("\nDisplaying second populated country in the world :"+topPopulatedCountries.get(1));
		//Another way of Adding values to Array List.
		
		List<String> topPopulatedCountries1 =new ArrayList<>( Arrays.asList("India","China","United States","Indonesia"));
		topPopulatedCountries1.add("Pakistan");
		
		// Displaying Fifth country from the given List.
		
		System.out.println("Displaying Fifth populated country in the world :"+topPopulatedCountries1.get(4));
		
	   
		
		//2. Creating a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		  System.out.println("\n\n*************** HashSet ***************");
		  Set<String> toptouristcountries = new HashSet<>();
		  toptouristcountries.add(" Great Pyramid of Giza");
		  toptouristcountries.add("The Great Wall of China");
		  toptouristcountries.add("The Taj Mahal");
		  toptouristcountries.add("The Eiffel Tower");
		  toptouristcountries.add("The Colosseum");
		  toptouristcountries.add("Disneyland Resort");
		  toptouristcountries.add("The Northern Lights");
		  toptouristcountries.add("Istanbul");
		  toptouristcountries.add("London");
		  toptouristcountries.add("Dubai");
		  
		  //Displaying count of most visited countries in the world
	
		  System.out.println("Displaying count of most visited countries in the world:"+toptouristcountries.size());

		
		  
		  // 3. Creating a map of the 5 largest cities in the United States and their populations.
		  
		  System.out.println("\n\n***************LinkedHashMap ***************");
		  
		  Map<String,String> uspoptncities = new LinkedHashMap<>();
		  uspoptncities.put("New York City","8,804,190");
		  uspoptncities.put("Los Angeles","3,898,747");
		  uspoptncities.put("Chicago","2,746,388");
		  uspoptncities.put("Houston","2,304,580");
		  uspoptncities.put("Phoenix","1,608,139");
		  for(Map.Entry<String,String> entry: uspoptncities.entrySet()) {
			  System.out.println(entry.getKey()+":"+entry.getValue());
		  }
			  
		  
		  //Displaying 2nd Populated City in the US
		  
		  System.out.println("Displaying 2nd Populated City in the US:"+uspoptncities.get("Los Angeles"));
		  System.out.println("Displaying 2nd Populated City in the US:"+uspoptncities);
		  
		  
		  //4.Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		  
		  System.out.println("\n\n***************Array ***************");
		  //Creating an array of 10 random integer
		  
		  
		  int[] num = {4,112,55,44,88,77,789,11,789};
		  
		  //Sum of 3rd and 5th value
		  int sum = num[2]+num[4];
		  
		  //Printing the sum values
		  
		  System.out.println("Printing out the sum of 3rd and 5th Value:"+sum);
		  
		  System.out.println("\n\n***************LinkedArrayList ***************");
		  
		 // 5. Creating a list of the top 5 highest-grossing movies of all time and print out the third movie
		 // on the list.
		  
		  List<String> top5grossmovie = new LinkedList<>();
		  
		  top5grossmovie.add("Avatar");
		  top5grossmovie.add("Avengers");
		  top5grossmovie.add("Titanic");
		  top5grossmovie.add("Star Wars");
		  top5grossmovie.add("Spider Man");
		  
		  //printing 3rd Movie on the list
		  System.out.println("Printing 3rd Movie on the list:"+top5grossmovie.get(2));
		  
		  
		  
		  
	}
	
	
	

}
