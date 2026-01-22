class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st =new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[i]<=st.peek())
            st.pop();
            if(!st.isEmpty())
            ans.add(st.peek());
            else
            ans.add(-1);
            st.push(arr[i]);
        }
        return ans;
        
    }
}