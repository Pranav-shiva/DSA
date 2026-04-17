class Solution {
    public int lastStoneWeight(int[] st) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    int n=st.length;
    for(int i=0;i<n;i++){
        pq.add(st[i]);
    }
   while(pq.size()>1){
    int a=pq.poll();
    int b=pq.poll();
    if(a>b)
    pq.add(a-b);

   }
   return (pq.size()==0)?0:pq.peek();

        
    }
}