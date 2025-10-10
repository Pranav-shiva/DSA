class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String c : tokens)
        {
            if("+-/*".contains(c)){
                 int s = st.pop();
                int f= st.pop();
            switch(c){
                case "+": st.push(f+s);break;
                case "-": st.push(f-s);break;
                case "*": st.push(f*s);break;
                case "/": st.push(f/s);break;
            }

        }
        else{
            st.push(Integer.parseInt(c));
        }
        }
        return st.peek();
    }
}