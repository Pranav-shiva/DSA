class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        int c=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]=='T')
        t.add(i);
        else
        p.add(i);
    }
    int i=0,j=0;
    while(i<p.size()&&j<t.size()){
        if(Math.abs(t.get(j)-p.get(i))<=k){
            i++;
            j++;
            c++;
        }
        else if(t.get(j)<p.get(i))
        j++;
        else
        i++;
    }
    return c;
        
    }
}