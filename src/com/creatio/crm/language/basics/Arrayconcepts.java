package com.creatio.crm.language.basics;

public class Arrayconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] empNames = new String [3];
		empNames[0] = "Amit";
		empNames[1] = "Anurag";
		empNames[2] = "Devi";
//		empNames[3] = "Bharath";
		
		
		String [] [] empGroups = new String [3] [2] ;
		
		empGroups[0][0] = "Amit";
		empGroups[0][1] = "Trivin";
		
		empGroups[1][1] = "Geetha";
		
		
		String [] [] [] empRoleGroups = new String [3] [2] [3] ;
		
		empRoleGroups[0][0][0] = "Developer 1";
		empRoleGroups[0][1][0] = "Tester 1";
		
		empRoleGroups[1][0][0] = "Developer 2";
		empRoleGroups[1][1][0] = "Tester 2";
		
		String[][] data = {{"ABC","123"}, {"XYZ","234"},{"CDF","567"}};
		System.out.println(data[2][0]);
		
		/*
		 * 3D array use to store products for A supermarket offers products in two main
		 * categories: "Groceries" and "Electronics." Each category is further divided
		 * into four sub categories, with each subcategory containing five products.
		 * 
		 */
		
		
		String [][][] products = {{{"Cola","Orange Juice","Lemonade","Green Tea","Black Coffee"} ,// Beverages
									{"Popcorn","Trail Mix","Beef Jerky","Salted Nuts","Rice Cakes"}, //Snacks
									{"Cottage Cheese","Heavy Cream","Ice Cream","Parmesan Cheese","Eggnog"}, //Dairy Products
									{"Apples","Bananas","Carrots","Potatoes","Onions"}},//Produce
									{{"Cola","Orange Juice","Lemonade","Green Tea","Black Coffee"} ,// Beverages
									{"Popcorn","Trail Mix","Beef Jerky","Salted Nuts","Rice Cakes"}, //Snacks
									{"Cottage Cheese","Heavy Cream","Ice Cream","Parmesan Cheese","Eggnog"}, //Dairy Products
									{"Apples","Bananas","Carrots","Potatoes","Onions"}//Produce
			}};
		//Main categories for Store
		String [] mainCategories = {"Groceries","Electronics"};
		//Subcategories for Groceries
		
		String [] subcategories = {"Beverages","Snacks","Dairy Products","Produce"};
		System.out.println("Product Catalog");
		
		for (int i =0;i<products.length; i++)
		{
			System.out.println("mainCategories:"+mainCategories[i]);
			for(int j=0;j<products[i].length;j++)
			{
				//System.out.println("Subcategories:"+subcategories[j]);
				
				for(int k=0;k<products[i][j].length;k++)
				{
					System.out.printf("Product ID:%d,Subcategories %s,Product Name :%s%n",(k+1),subcategories[j],products[i][j][k]);
					
				}
				
			}
		
		
									
									
		}
	}

}

