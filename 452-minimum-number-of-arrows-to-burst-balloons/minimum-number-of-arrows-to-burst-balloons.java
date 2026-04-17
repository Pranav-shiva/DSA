class Solution {
    public int findMinArrowShots(int[][] p) {
        Arrays.sort(p,(a,b)->Integer.compare(a[0],b[0]));
        int max=0,c=p.length,l=p[0][0],r=p[0][1];
        for(int i=1;i<p.length;i++){
            if(p[i][0]<=r){
                r=Math.min(r,p[i][1]);
                l=Math.min(l,p[i][0]);
                c--;
            }
            else{
                r=p[i][1];
                l=p[i][0];
            }
     
        }
        return c;
        
    }
}