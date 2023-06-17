/*
1475. Final Prices With a Special Discount in a Shop

You are given an integer array prices where prices[i] is the price of the ith item in a shop.

There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.

Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
*/

class Solution1475 {
  public int[] finalPrices(int[] prices) {
    int[] response = new int[prices.length];

    for (int i = 0; i < prices.length; i++) {
      response[i] = prices[i] - verifyDiscount(prices, prices[i], i + 1);  
    }
    
    return response;
  }

  private int verifyDiscount(int[] prices, int number, int index) {
    if (index > prices.length -1) return 0;
    
    for (int i = index; i < prices.length; i++) {
      if (prices[i] <= number) return prices[i];
    }

    return 0;
  }
}