class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            while(!st.isEmpty()&&st.peek()<=hm.get(a)){
            st.pop();
            st1.pop();
            }
            if(st.isEmpty()||st1.peek()==a){
            ans.add(-1);
            }
            else{
                ans.add(st1.peek());
            }
            st.push(hm.get(a));
            st1.push(a);
        }
        Collections.reverse(ans);
        return ans;
        
    }
}