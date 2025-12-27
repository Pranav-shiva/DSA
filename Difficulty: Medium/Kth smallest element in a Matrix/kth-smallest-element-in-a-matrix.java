class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                pq.add(mat[i][j]);
            }
        }
        int i=1;
        int result=1;
        while(!pq.isEmpty()){
             result=pq.remove();
            if(i==k)
            return result;
            i++;
        }
        return result;
        
    }
}
