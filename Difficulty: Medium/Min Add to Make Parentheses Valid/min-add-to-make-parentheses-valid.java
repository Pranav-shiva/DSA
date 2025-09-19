class Solution {
    public int minParentheses(String s) {
        // code here
     int bal=0,in=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if('('==c){
                bal++;
                
            }
            else{
                if(bal>0){
                bal--;
            }
            else{
                in++;
            }
            }
            
           
        }
        return bal+in;
    }
}
