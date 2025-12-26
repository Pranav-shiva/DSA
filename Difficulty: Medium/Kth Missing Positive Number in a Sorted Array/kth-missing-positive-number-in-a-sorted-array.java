class Solution {
    public int kthMissing(int[] arr, int k) {
        int n=arr.length,z=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        int i=0;
        for(i=1;i<arr[n-1];i++){
            if(!hs.contains(i))
            {
                z++;
            }
            if(z==k)
            return i;
            
        }
        while(z<=k){
            z++;
            i++;
        }
        return i-1; 
    }
}