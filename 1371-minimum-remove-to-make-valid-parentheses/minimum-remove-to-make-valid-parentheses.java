class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st =new Stack<>();
        char arr[]=new char[s.length()];
        for(int i=0;i< s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
           else if (s.charAt(i) == ')'){
            if(st.isEmpty()){
                arr[i]='!';

            }
            else{
                st.pop();
            }
           }
        }
        while(!st.isEmpty()){
            arr[st.pop()]='!';
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(arr[i]!='!'){
                sb.append(s.charAt(i));

            }

        }
        return sb.toString();
        
    }
}