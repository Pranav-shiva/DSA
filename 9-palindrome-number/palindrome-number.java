class Solution {
    public boolean isPalindrome(int x) {
        int y=x,num=0;
        if(x<0) return false;
        int n=0;
        while(x>0){
            num=num*10+(x%10);
            x=x/10;
        }
        

        return num==y;
        
    }
}