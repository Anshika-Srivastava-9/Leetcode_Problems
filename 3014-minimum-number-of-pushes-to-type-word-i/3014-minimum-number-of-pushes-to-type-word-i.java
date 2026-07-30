class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        // Count the frequency of each character
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }

        // Sort the frequencies
        Arrays.sort(freq);

        int pushes = 0;
        int position = 1;

        // Traverse from largest frequency to smallest
        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0) {
                continue;
            }

            // Characters 1-8 require 1 push,
            // 9-16 require 2 pushes
            int cost = ((position - 1) / 8) + 1;
            pushes += freq[i] * cost;

            position++;
        }

        return pushes;
    }
}