class Solution {
  public int maxProfit(int[] prices) {
     int n = prices.length;
     int[] left = new int[n];
     int[] right = new int[n];
     int min = prices[0];
     for(int i=1;i<n;i++)
     {
        min=Math.min(min,prices[i]);
        left[i] = Math.max(left[i-1],prices[i]-min);
     }
     int max = prices[n-1];
     for(int j=n-2;j>=0;j--)
     {
         max=Math.max(max,prices[j]);
         right[j]=Math.max(right[j+1],max-prices[j]);
     }
     int total_profit=0;
     for(int k=0;k<n;k++)
     {
         total_profit=Math.max(total_profit,left[k]+right[k]);
     }
     return total_profit;
  }
}
