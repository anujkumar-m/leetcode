class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, c = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (r < n) {
            char ch = s.charAt(r);
            if (hm.containsKey(ch)) {
                l = Math.max(l, hm.get(ch) + 1);
            }
            hm.put(s.charAt(r), r);
            c = Math.max(c, r - l + 1);
            r++;

        }
        return c;
    }
}