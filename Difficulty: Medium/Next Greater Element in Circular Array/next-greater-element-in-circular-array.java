class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n=arr.length;
        int a[]=new int [n*2];
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n*2;i++){
            a[i]=arr[i%n];
        }
         for(int i=(n*2)-1;i>=0;i--){
             while(!st.isEmpty()&&arr[i%n]>=st.peek())
             st.pop();
             if(st.isEmpty())
             a[i]=-1;
             else
             a[i]=st.peek();
             st.push(arr[i%n]);
            
        }
        for(int i=0;i<n;i++){
            ans.add(a[i]);
            
        }
        
        
        return ans;
        
    }
}