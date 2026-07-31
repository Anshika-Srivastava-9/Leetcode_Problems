import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }

        
        Arrays.sort(freq);

        int pushes = 0;
        int position = 1;

        
        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0) {
                continue;
            }

            
            int cost = ((position - 1) / 8) + 1;

            pushes += freq[i] * cost;
            position++;
        }

        return pushes;
    }
}