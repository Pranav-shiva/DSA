
class Solution {
    public int getMinDiff(int[] arr, int k) {
   
        
    int n = arr.length;
    Arrays.sort(arr);

    int a = arr[n - 1] - arr[0];
    int smallest = arr[0] + k;
    int largest = arr[n - 1] - k;

    for (int i = 0; i < n - 1; i++) {
        int minVal = Math.min(smallest, arr[i + 1] - k);
        int maxVal = Math.max(largest, arr[i] + k);

        if (minVal < 0) continue;

        a = Math.min(a, maxVal - minVal);
    }
    return a;
}

}
