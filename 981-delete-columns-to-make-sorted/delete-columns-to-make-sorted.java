class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0,scount=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
                int a=strs[j].charAt(i);
                int b=strs[j+1].charAt(i);
                if(a>b)
                {
                    scount++;
                    break;
                }

            }
            if(scount!=0){
                count++;
            }
            scount=0;
        }
        return count;
        
    }
}