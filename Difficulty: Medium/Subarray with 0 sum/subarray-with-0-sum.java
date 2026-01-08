class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        hs.add(0);
        for(int i=0;i<arr.length;i++){
        
            sum=sum+arr[i];
            if(hs.contains(sum)||arr[i]==0)
            return true;
            hs.add(sum);
        }
        return false;
    }
}