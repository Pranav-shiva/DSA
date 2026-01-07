class Solution {
    public String convert(String s, int n) {
        String [] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int in=0;in<n&&i<s.length();in++){
                a[in]+=s.charAt(i);
                i++;
            }
   for(int in=n-2;in>0&&i<s.length();in--){
                a[in]+=s.charAt(i);
                i++;
            }
                    }
                    StringBuilder sb=new StringBuilder("");
                    for( i=0;i<n;i++){
                        sb.append(a[i]);
                    }
                    return sb.toString();
        
    }
}