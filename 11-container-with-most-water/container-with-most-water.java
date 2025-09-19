class Solution {
    public int maxArea(int[] h) {
        int r=h.length-1,l=0,max=0;

        while(l<r){

            max=Math.max(max,(r-l)*Math.min(h[l],h[r]));
            if(h[l]<h[r]){
                l++;
            }
            else{
                r--;
            }


        }

        return max;
    }
}           
