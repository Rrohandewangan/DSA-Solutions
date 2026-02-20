//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


// imp points ->
// 1. buy at min point and sell the max point to get max profit
// 2. we assume everyday as selling day.
// 3. 


public class StockBuyAndSell {

    // Time Complexity -> O(n)
    // SC - O(1)
    public static int stockBuyAndSell(int[] prices) {
        int bestBuy = prices[0] ;
        int maxProfit = 0 ;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i]-bestBuy) ;
            }
             bestBuy = Math.min(bestBuy, prices[i]) ;
        }
        return maxProfit ;
    }
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,3,6,4} ;
        System.out.println(stockBuyAndSell(prices));

    }
}
