package com.creatio.crm.language.basics;

public class BuyandSellAssignment24 {

	public static void main(String[] args) {

		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximim profit for day price" + ":" + maxProfit(prices1));
		int[] prices2 = { 7, 6, 4, 3, 1 };
		System.out.println("No profit for day :" + maxProfit(prices2));
	}
	
	
	

	public static int maxProfit(int[] prices) {
		if (prices.length == 0 || prices == null) {
			return 0;

		}
		int profit = 0;
		int minPrice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			int currentProfit = prices[i] - minPrice;
			if (currentProfit > profit) {
				profit = currentProfit;
			}
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			}

		}

		return profit;
	}

}
