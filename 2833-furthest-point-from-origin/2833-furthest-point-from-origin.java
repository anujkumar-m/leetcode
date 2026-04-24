class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R')
                right++;
            else if (c == 'L')
                left++;
        }
        System.out.println(left + " " + right);
        return Math.abs(moves.length() - Math.min(right, left) * 2);
    }
}