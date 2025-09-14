class Solution {
    public String frequencySort(String s) {
      
        HashMap<Character,Integer> hm= new HashMap<>();
        int n=s.length();
         int arr[][]=new int[s.length()][3];
         
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            int a=s.charAt(i);
             char c=s.charAt(i);
             arr[i][0]=hm.get(c);
            arr[i][1]=a;
            arr[i][2]=i;
        }
        Arrays.sort(arr, (a, b) -> {
    if (a[0] != b[0]) return Integer.compare(-a[0], -b[0]);
    return Integer.compare(-a[1], -b[1]);
});

         StringBuilder sb=new StringBuilder("");
         for(int i=0;i<n;i++){
            sb.append(s.charAt(arr[i][2]));
         }
return sb.toString();
        
    }
}