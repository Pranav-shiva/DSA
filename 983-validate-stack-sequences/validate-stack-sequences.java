class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        int m=popped.length;
        if(m!=n)
        return false;
        int k=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<m;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && k < m && st.peek() == popped[k]){
                st.pop();
                k++;
            }
           
        }
        if(st.isEmpty()){
            return true;
        }
        while(!st.isEmpty()){
            if(st.pop()!=popped[k])
            return false;
            k++;
        }
         return true;
        
    }
}