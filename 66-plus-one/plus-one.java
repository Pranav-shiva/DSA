class Solution {
    public int[] plusOne(int[] d) {
        int n=d.length,carry=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=n-1;i>0;i--){
            int sum=0;
            if(i==n-1){
                sum=d[i]+1;
            
            }
            else{
                sum=d[i]+carry;
            }

            if(sum>9){
                arr.add(0);

                carry=1;
            }
            else{
                carry=0;
                arr.add(sum);
            }

        }
        int sum=d[0]+carry;
        if(n==1){
           sum= sum+1;
        }
        if(sum>9)
        {
            arr.add(0);
            arr.add(1);
        }
        else {
            arr.add(sum);
        }
        Collections.reverse(arr);
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
}