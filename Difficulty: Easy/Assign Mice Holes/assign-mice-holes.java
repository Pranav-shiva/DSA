class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        int max=0;
        for(int i=0;i<holes.length;i++){
            int val=mices[i]-holes[i];
            max=Math.max(max,Math.abs(val));
        
            
        }
        return max;
        
    }
}