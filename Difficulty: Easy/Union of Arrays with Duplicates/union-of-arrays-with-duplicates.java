class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
         for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }
        for(int z:hs){
            ans.add(z);
        }
        Collections.sort(ans);
        return ans;
    }
}