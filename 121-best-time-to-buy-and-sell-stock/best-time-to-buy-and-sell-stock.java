class Solution {
    public int maxProfit(int[] prices) {
        int max=0,sp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(sp<prices[i]){
                int profit=prices[i]-sp;
                max=Math.max(max,profit);

            }
            else{
                sp=prices[i];
            }
        }
        return max;
        
    }
}