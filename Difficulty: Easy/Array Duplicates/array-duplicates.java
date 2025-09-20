class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(hs.contains(arr[i])){
                ans.add(arr[i]);
            }
            hs.add(arr[i]);
            
        }
        return ans;
        
    }
}