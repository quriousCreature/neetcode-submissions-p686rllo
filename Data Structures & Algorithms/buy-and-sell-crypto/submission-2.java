class Solution {
    public int maxProfit(int[] prices) {
        int sell = prices[prices.length-1];
        int buy = prices[prices.length-1];
        int profit=0;
        for(int  i= prices.length-2; i>=0; i-- ) {
            // System.out.println("Sell = "+ sell +" buy= "+ buy );
            int curr = prices[i];
            if (sell - curr > profit) { // check the profit if we bought at ith price
                buy = curr;
                profit = sell - buy;
            }
            if (sell < curr) /* check if is the max sell price  */{
                sell = curr;
            }
        }
        // System.out.println("Sell = "+ sell +" buy= "+ buy );
        return profit;
    }
}
