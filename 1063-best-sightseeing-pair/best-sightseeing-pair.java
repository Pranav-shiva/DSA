class Solution {
    public int maxScoreSightseeingPair(int[] val) {  
            int max=0,cmax=val[0]; 
            for(int i=1;i<val.length;i++){
        max=Math.max(max,cmax+val[i]-i); 
        cmax=Math.max(cmax,val[i]+i);
        
        }
        return max;
    }
}