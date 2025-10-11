class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        if(num.length()<=k)
        return "0";
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            while(!st.isEmpty()&&k>0&&st.peek()-'0'>c-'0'){
                st.pop();
                k--;
            }
            st.push(c);
        }
        if(st.isEmpty())return "0";
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            sb.append(st.pop());

        }
        sb.reverse();
        int flag=0;
        while (sb.length() > 0 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
    }
            

        
        return sb.length()>0?sb.toString():"0";
    }
}