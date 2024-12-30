namespace LeetCode;

public class Problem121
{
    public static void BusinessLogic()
    {
        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = { 7, 6, 4, 3, 1 };

        Console.WriteLine("Max Profit for prices1: " + MaxProfit(prices1));
        Console.WriteLine("Max Profit for prices2: " + MaxProfit(prices2));
    }

    public static int MaxProfit(int[] prices)
    {
        if (prices.Length == 0) return 0;

        int minPrice = int.MaxValue;
        int maxProfit = 0;

        foreach (int price in prices)
        {
            if (price < minPrice)
            {
                minPrice = price;
            }
            else if (price - minPrice > maxProfit)
            {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    
}
