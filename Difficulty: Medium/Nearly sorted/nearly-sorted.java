class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        int arr1[]=new int[arr.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }
        int j=0;
        for(int i=k+1;i<arr.length;i++){
            arr1[j]=pq.remove();
            pq.add(arr[i]);
            j++;
        }
        while(!pq.isEmpty()){
            arr1[j]=pq.remove();
            j++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr1[i];
        }
    }
}
