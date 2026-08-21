class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            if (containsWords(allowed, s))
                count++;
        }
        return count;
    }

    boolean containsWords(String alw, String s) {
        for (char c : s.toCharArray()) {
            if (!alw.contains(c + ""))
                return false;
        }
        return true;
    }
}