import java.util.Stack;

class Solution {
    public int subarrayRanges(int[] arr) {
        int n = arr.length;

        long maxSum = 0, minSum = 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];

        Stack<Integer> stack = new Stack<>();

        // ---------- Maximum Contribution ----------
        // Previous Greater Element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            leftMax[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Greater or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            rightMax[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        stack.clear();

        // ---------- Minimum Contribution ----------
        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            leftMin[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Smaller or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            rightMin[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // ---------- Calculate Result ----------
        for (int i = 0; i < n; i++) {
            maxSum += (long) arr[i] * leftMax[i] * rightMax[i];
            minSum += (long) arr[i] * leftMin[i] * rightMin[i];
        }

        return (int) (maxSum - minSum);
    }
}
