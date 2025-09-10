class Solution {
    public String largestSwap(String s) {
        if (s == null || s.length() <= 1) return s;

        int n = s.length();
        int[] lastPos = new int[10];
        for (int i = 0; i < 10; i++) lastPos[i] = -1;

        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            lastPos[arr[i] - '0'] = i;
        }

        for (int i = 0; i < n; i++) {
            int cur = arr[i] - '0';
            for (int d = 9; d > cur; d--) {
                if (lastPos[d] > i) {
                   
                    char tmp = arr[i];
                    arr[i] = arr[lastPos[d]];
                    arr[lastPos[d]] = tmp;
                    return new String(arr);
                }
            }
        }

      
        return s;
    }
}

