// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Example 2:
// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

public class Problem121 {
	public static void main(String[] args) {
		int[] prices1 = {7, 1, 5, 3, 6, 4}; 
		int[] prices2 = {7, 6, 4, 3, 1}; 
		System.out.println("Max Profit for prices1: " + maxProfit(prices1));
		System.out.println("Max Profit for prices2: " + maxProfit(prices2));
	}

	/*
	 * int minPrice = int.MaxValue - inicializamos el minPrice con el valor maximo posible para segurarnos de que cualquier precio en el array sera menor.
	 * int maxProfit = 0 - inicializamos maxProfit en 0 porque no hemos calculado ningun beneficio aun
	 * iteramos a traves del array de precios usando foreach
	 * en cada iteracion
	 * 				si el precioActual < minPrice, actualizamos minPrice
	 * 				si el precioActual - minPrice > maxProfit, actualizamos maxProfit
	 * al final maxProfit tendra el mejor profit
	 */

	public static int maxProfit(int[] prices) { if (prices.length == 0) return 0;
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int price : prices) { 
			if (price < minPrice) { 
				minPrice = price; 
			} 
			else if (price - minPrice > maxProfit) { 
				maxProfit = price - minPrice; 
			} 
		} return maxProfit; 
	} 

}