class Solution {
    public int findMoves(int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int sum=0;
        for(int i=0;i<chairs.length;i++){
            int max=Math.max(passengers[i],chairs[i]);
            int min=Math.min(passengers[i],chairs[i]);
            sum=sum+max-min;
        }
        return sum;
    }
}
