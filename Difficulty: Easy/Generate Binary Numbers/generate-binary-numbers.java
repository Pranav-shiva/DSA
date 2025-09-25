class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            StringBuilder sb=new StringBuilder("");
            int a=i;
            while(a>0){
                String s=Integer.toString(a%2);
                a=a/2;
                sb.append(s);
            }
            sb.reverse();
            ans.add(sb.toString());
            
            
        }
        return ans;
        
    }
}
