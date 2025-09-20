class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            int a=arr[i];
            hm.put(a,hm.getOrDefault(a,0)+1);
            if(hm.get(a)>n/2)return a;
        }
        return -1;
    }
}