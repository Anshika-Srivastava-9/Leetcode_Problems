class Solution {

    public String smallestPalindrome(String s) {

        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();

        char middle = '\0';

        for (int i = 0; i < 26; i++) {

            int times = count[i] / 2;

            while (times-- > 0) {
                firstHalf.append((char) (i + 'a'));
            }

            if (count[i] % 2 == 1) {
                middle = (char) (i + 'a');
            }
        }

        StringBuilder answer = new StringBuilder();

        answer.append(firstHalf);

        if (middle != '\0') {
            answer.append(middle);
        }

        answer.append(new StringBuilder(firstHalf).reverse());

        return answer.toString();
    }
}