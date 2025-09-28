import java.util.ArrayList;
import java.util.ArrayDeque;

class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (n == 0) return ans;

        ArrayDeque<Integer> dqMax = new ArrayDeque<>(); 
        ArrayDeque<Integer> dqMin = new ArrayDeque<>(); 

        int L = 0, bestL = 0, bestLen = 0;

        for (int R = 0; R < n; R++) {
            while (!dqMax.isEmpty() && arr[dqMax.peekLast()] <= arr[R]) dqMax.pollLast();
            dqMax.offerLast(R);
            while (!dqMin.isEmpty() && arr[dqMin.peekLast()] >= arr[R]) dqMin.pollLast();
            dqMin.offerLast(R);
            while (!dqMax.isEmpty() && !dqMin.isEmpty() && arr[dqMax.peekFirst()] - arr[dqMin.peekFirst()] > x) {
                if (dqMax.peekFirst() == L) dqMax.pollFirst();
                if (dqMin.peekFirst() == L) dqMin.pollFirst();
                L++;
            }
            int curLen = R - L + 1;
            if (curLen > bestLen) {
                bestLen = curLen;
                bestL = L;
            }
        }
        for (int i = bestL; i < bestL + bestLen; i++) ans.add(arr[i]);
        return ans;
    }
}
