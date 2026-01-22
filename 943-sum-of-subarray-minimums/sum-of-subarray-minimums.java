class Solution {
    final static long mod=1000000007;
    public int sumSubarrayMins(int[] arr) {
        ArrayList<Integer> sp=new ArrayList<>();
                ArrayList<Integer> sn=new ArrayList<>();
int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[i]<=arr[st.peek()])
            st.pop();
            if(!st.isEmpty())
            sp.add(i-st.peek());
            else
            sp.add(i+1);
            st.push(i);

        }
        st=new Stack<>();
              for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()])
            st.pop();
            if(!st.isEmpty())
            sn.add(st.peek()-i);
            else
            sn.add(n-i);
            st.push(i);

        }
        Collections.reverse(sn);
        long sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+(sn.get(i)%mod*sp.get(i)%mod*arr[i]%mod))%mod;
        }
        return (int)sum;


        
    }
}