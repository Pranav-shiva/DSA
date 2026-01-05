class Solution {
    public long maxMatrixSum(int[][] m) {
        long sum=0;
        int min=Integer. MAX_VALUE,c=0;        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
              sum  =sum+(long)Math.abs(m[i][j]);
        if(m[i][j]<0)
                    c++;
                min=Math.min(min,Math.abs(m[i][j]));
                
        
            }}
        System.out.print(c);
        if(c%2==0)
        return sum;
        else
            return sum-(min*2);
    }
}