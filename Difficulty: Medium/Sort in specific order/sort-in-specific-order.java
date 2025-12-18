class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr1.add(arr[i]);
            }
            else
            arr2.add(arr[i]);
        }
        Collections.sort(arr1);
                Collections.sort(arr2);

        int k=0;
for(int i=arr2.size()-1;i>=0;i--){
    arr[k]=arr2.get(i);
    k++;
}
for(int i=0;i<arr1.size();i++){
    arr[k]=arr1.get(i);
    k++;
    
}
        
    }
}
