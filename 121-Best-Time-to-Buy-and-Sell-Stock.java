class Solution {
    public int maxProfit(int[] prices) {
        // Initialize variables:
        // - buyPrice to the price of the first day (initially assumed as the minimum price to buy)
        // - profit to 0, which will store the maximum profit we can achieve
        int buyPrice = prices[0];
        int profit = 0;

        // Iterate through the prices array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // If current price is less than buyPrice, update buyPrice to the current price
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            // Calculate the profit by subtracting the current buyPrice from the current price
            // and update profit if this value is greater than the previously recorded profit
            profit = Math.max(profit, prices[i] - buyPrice);
        }

        // Return the maximum profit that can be achieved
        return profit;
    }
}

/*
 * Time Complexity: O(n)
 * - The algorithm iterates through the array once, where n is the number of days (prices.length).
 * 
 * Space Complexity: O(1)
 * - The algorithm uses a constant amount of extra space for variables buyPrice and profit.
 */
