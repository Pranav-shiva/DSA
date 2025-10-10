class Solution {
    public int longestValidParentheses(String s) {
        int r=0,l=0,max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if('('==c)r++;
            if(')'==c)l++;
            if(r==l){
                max=Math.max(max,r*2);
            }
            if(l>r){
                r=0;
                l=0;
            }
        }
        r=0;
        l=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if('('==c)r++;
            if(')'==c)l++;
            if(r==l){
                max=Math.max(max,r*2);
            }
            if(l<r){
                r=0;
                l=0;
            }
        }
        return max;
    }
}