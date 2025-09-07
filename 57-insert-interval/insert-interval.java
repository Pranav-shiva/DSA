import java.util.*;

class Solution {
    public int[][] insert(int[][] interval, int[] newi) {
        int a1 = newi[0], a2 = newi[1], n = interval.length;

    
        if (n == 0) return new int[][]{{a1, a2}};

        HashSet<Integer> hs = new HashSet<>();

     
        for (int i = 0; i < n; i++) {
            int b1 = interval[i][0], b2 = interval[i][1];
            if (!(b2 < a1 || b1 > a2)) hs.add(i);
        }

        if (hs.isEmpty()) {
            int insertPos = n; 
            for (int i = 0; i < n; i++) {
                if (interval[i][0] > a1) { insertPos = i; break; }
            }
            int[][] ans = new int[n + 1][2];
            int idx = 0;
            for (int i = 0; i < insertPos; i++) ans[idx++] = new int[]{interval[i][0], interval[i][1]};
            ans[idx++] = new int[]{a1, a2};
            for (int i = insertPos; i < n; i++) ans[idx++] = new int[]{interval[i][0], interval[i][1]};
            return ans;
        }

      
        int first = Integer.MAX_VALUE, last = Integer.MIN_VALUE;
        int mergedStart = a1, mergedEnd = a2;
        for (int idx : hs) {
            first = Math.min(first, idx);
            last = Math.max(last, idx);
            mergedStart = Math.min(mergedStart, interval[idx][0]);
            mergedEnd = Math.max(mergedEnd, interval[idx][1]);
        }

        
        int newSize = n - hs.size() + 1;
        int[][] ans = new int[newSize][2];
        int k = 0;
        for (int i = 0; i < first; i++) ans[k++] = new int[]{interval[i][0], interval[i][1]};
        ans[k++] = new int[]{mergedStart, mergedEnd};
        for (int i = last + 1; i < n; i++) ans[k++] = new int[]{interval[i][0], interval[i][1]};

        return ans;
    }
}
