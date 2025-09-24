import java.util.*;

class SpecialQueue {
    private Queue<Integer> q;

    public SpecialQueue() {
        q = new LinkedList<>();
    }

    // Insert element into queue
    public void enqueue(int x) {
        q.offer(x);
    }

    // Remove element from queue
    public void dequeue() {
        if (q.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        q.poll();
    }

    // Get front element
    public int getFront() {
        if (q.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return q.peek();
    }

    // Get minimum element (O(n))
    public int getMin() {
        if (q.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int min = Integer.MAX_VALUE;
        for (int val : q) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    // Get maximum element (O(n))
    public int getMax() {
        if (q.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int max = Integer.MIN_VALUE;
        for (int val : q) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
