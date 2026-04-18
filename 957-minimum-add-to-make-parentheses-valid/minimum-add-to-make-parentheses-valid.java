class Solution {
    public int minAddToMakeValid(String s) {
        int l=0,r=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            st.push('(');
        else{
            if(!st.isEmpty()&&st.peek()=='(')
            st.pop();
            else{
                r++;
            }

        }
        }
        return r+st.size();
        
    }
}