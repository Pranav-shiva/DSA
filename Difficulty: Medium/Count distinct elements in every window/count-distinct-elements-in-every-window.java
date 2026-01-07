class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        
        ArrayList<Integer>  ans =new ArrayList<>();
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            int a = arr[i];
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }
            else
            hm.put(a,1);
        }
        ans.add(hm.size());
        for(int i=k;i<arr.length;i++){
            int a=arr[i],b=arr[i-k];
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }
            else
            hm.put(a,1);
              hm.put(b,hm.get(b)-1);
              if(hm.get(b)==0)
              hm.remove(b);
              ans.add(hm.size());
            
            
        }
        return ans;
    }
}