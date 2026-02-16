class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int b = prices[0];
        int n = prices.length;
        for(int i =0 ; i < n ; i++ ){
          if(prices[i] < b){
            b = prices[i];
          }
          max = Math.max(max,prices[i]-b);
        }
        
        return max >= 0 ? max : 0;
    }
}
