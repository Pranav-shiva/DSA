class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int tg=0,tc=0;
        for(int i=0;i<gas.length;i++){
            tg=tg+gas[i];
            tc=tc+cost[i];
        }
        if(tg<tc)
        return -1;
        int c=0,s=0;
        for(int i=0;i<gas.length;i++){
            c+=gas[i]-cost[i];
            if(c<0){
                s=i+1;
                c=0;
            }
        }
        return s;
        
    }
}