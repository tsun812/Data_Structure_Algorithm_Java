class SolutionTwoPointer {
    //time O(n), space O(1)
    public int maxProfit(int[] prices) {
        int in = 0;
        int res = 0;
        int prev = 0;
        for(int i = 1; i < prices.length; i++){
            int curr = prices[i];
            if(prices[prev]>curr && prev > in){
                res = res + prices[prev] - prices[in];
                in = i;
            }
            if(curr < prices[in]){
                in = i;
            }
            prev = i;
        }
        if(prices[prev] > prices[in]) res = res + prices[prev] - prices[in];
        return res;
    }
    
}

class Solution{
     public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            res += Math.max(0, prices[i]-prices[i-1]);
        }
        return res;
    }
}