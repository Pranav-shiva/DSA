class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> hm= new HashMap<>();
    
        int j=0,c=0,i=0;
        while(j<arr.length){
            int a=arr[j];
            hm.put(a,hm.getOrDefault(a,0)+1);
            if(hm.size()>k){
                
                
            

                while(hm.size()>k){
                    hm.put(arr[i] ,hm.get(arr[i])-1);
                    if(hm.get(arr[i])==0)
                    hm.remove(arr[i]);
                    i++;
                
                }
            }
            c=c+j-i+1;
            j++;
        }
        return c;
    }
    
}