class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0,c=0;
                hm.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(hm.containsKey(sum-k)){
                c+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        return c;
    
        
        
    }
}