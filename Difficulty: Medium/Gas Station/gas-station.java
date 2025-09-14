class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
        int s1=0,s2=0, n= gas.length;
        for(int i=0;i<n;i++){
            s1+=gas[i];
            s2+=cost[i];
            
        }
        if(s1<s2){
            return -1;
            
        }
        
        int start=0,bal=0;
        for(int i=0;i<n;i++){
            
            bal+=gas[i]-cost[i];
            if(bal<0){
                start=i+1;
                bal=0;
            }
        }
        return start;
    }
}