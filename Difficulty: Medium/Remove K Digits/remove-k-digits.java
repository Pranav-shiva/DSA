class Solution {
    public String removeKdig(String s, int k) {
        // code here
        
        Stack<Character> st=new Stack<>();
        int n=s.length(),c=0;
        char a=s.charAt(0);
        st.push(a);
        for(int i=1;i<n;i++){
         a=s.charAt(i);
            while(!st.isEmpty()&&st.peek()>a&&c<k){
                st.pop();
                
                c++;
                
            }
            st.push(a);
            
        }
        while(c<k){
            st.pop();
            c++;
        }
        StringBuilder sb= new StringBuilder();
        Collections.reverse(st);
        while(!st.isEmpty()&&st.peek()=='0')
        st.pop();
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.length()==0?"0":sb.toString();
    }
}