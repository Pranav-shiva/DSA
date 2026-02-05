class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int [] r=new int[n];
        int [] l=new int[n];
         r[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
           r[i] =Math.max(r[i+1],h[i]);
        }
        l[0]=h[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],h[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(Math.min(r[i],l[i])-h[i]);
        }
        return sum;


    }
}