class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int j=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                while(hm.containsKey(ch)){
                    hm.put(s.charAt(j),hm.get(s.charAt(j))-1);
                    if(hm.get(s.charAt(j))==0)
                    hm.remove(s.charAt(j));
                    j++;
            }}
            hm.put(ch,1);
            max=Math.max(max,hm.size());
        
        }
        return max;
        
        
    }
}