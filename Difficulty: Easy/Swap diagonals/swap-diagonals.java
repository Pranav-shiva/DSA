class Solution {
    public void swapDiagonal(int[][] mat) {
        // code here
        int k=mat.length-1;
        for(int i=0;i<mat.length;i++){
            int tem=mat[i][i];
            mat[i][i]=mat[i][k];
            mat[i][k]=tem;
            k--;
            
            
        }
        
    }
}