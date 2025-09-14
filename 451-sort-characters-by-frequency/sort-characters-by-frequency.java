import java.util.*;

class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        if (n == 0) return "";

        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<List<Character>> buckets = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) buckets.add(new ArrayList<>());

        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            int f = e.getValue();
            char c = e.getKey();
            buckets.get(f).add(c);
        }

        StringBuilder sb = new StringBuilder(n);
        for (int f = n; f >= 1; f--) {
            List<Character> bucket = buckets.get(f);
            if (bucket.isEmpty()) continue;
            for (char c : bucket) {
                for (int i = 0; i < f; i++) sb.append(c);
            }
        }
        return sb.toString();
    }

   
}
