class Solution {
    public int reverse(int x) {
        long y=x;
        if(x>=Math.pow(2,31)-1||x<=-1*Math.pow(2,31)){
            return 0;
        }
        if(x<0){

            y=y*-1;
        }
        long num=0;
       while(y>0){
        
        num=num*10+(y%10);
        
        y=y/10;
                
       }
       if(num>=Math.pow(2,31)-1 || num<=-1*Math.pow(2,31)) {
    return 0;
}


    return x<0?(int)num*-1:(int)num;
        
    }
}