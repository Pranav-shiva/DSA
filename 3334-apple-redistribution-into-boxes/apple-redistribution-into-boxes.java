class Solution {
    public int minimumBoxes(int[] a, int[] c) {
        Arrays.sort(c);
        int sum=0,count=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        for(int i=c.length-1;i>=0;i--){
            if(sum<=0){
                return count;
            }
            sum=sum-c[i];
            count++;
        }
        return count;
        
    }
}