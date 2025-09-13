import java.util.*;

class Solution {
    public static int minCost(int n, int m, int[] x, int[] y) {
        final int MOD = 1_000_000_007;

        Arrays.sort(x); 
        Arrays.sort(y); 

        int i = x.length - 1; 
        int j = y.length - 1; 

        long horizontalSegments = 1; 
        long verticalSegments = 1;  
        long ans = 0;

        while (i >= 0 && j >= 0) {
            if (x[i] > y[j]) {
              
                ans = (ans + (long)x[i] * verticalSegments) % MOD;
                horizontalSegments++;
                i--;
            } else {
             
                ans = (ans + (long)y[j] * horizontalSegments) % MOD;
                verticalSegments++;
                j--;
            }
        }

        while (i >= 0) {
            ans = (ans + (long)x[i] * verticalSegments) % MOD;
            i--;
        }
        while (j >= 0) {
            ans = (ans + (long)y[j] * horizontalSegments) % MOD;
            j--;
        }

        return (int) ans;
    }
}
