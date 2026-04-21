class Solution {
    public int hammingWeight(int n) {
        String bit = Integer.toBinaryString(n);
        int count = 0;
        for (char c : bit.toCharArray()) {
            if (c == '1')
                count += 1;
        }
        return count;
    }
}