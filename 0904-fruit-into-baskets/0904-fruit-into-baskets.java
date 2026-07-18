class Solution {
    public int totalFruit(int[] fruits) {
    int n=fruits.length;
    int l = 0;
int r = 0;
int maxlen = 0;

Map<Integer, Integer> mp = new HashMap<>();

while (r < n) {

    // Add current fruit
    mp.put(fruits[r], mp.getOrDefault(fruits[r], 0) + 1);

    // Shrink window if > 2 fruit types
    while (mp.size() > 2) {

        mp.put(fruits[l], mp.get(fruits[l]) - 1);

        if (mp.get(fruits[l]) == 0) {
            mp.remove(fruits[l]);
        }

        l++;
    }

    maxlen = Math.max(maxlen, r - l + 1);

    r++;
}
return maxlen;
    }
}