class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] q) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<q.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>q[i][1])
                break;
                if(arr[j]>=q[i][0]&&arr[j]<=q[i][1])
                count++;
            }
            ans.add(count);
            
        }
        return ans;
        
    }
}
