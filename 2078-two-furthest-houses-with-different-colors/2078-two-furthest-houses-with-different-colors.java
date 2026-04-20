class Solution {
    public int maxDistance(int[] c) {
        int j = c.length;
        int max = 0;
        for (int i = 0; i < j; i++) {
            if ((c[i]^c[j - 1]) != 0){
                max = Math.max(max, Math.abs(j - i - 1));
                break;
            }
        }

        for (int i = 0; i < j; i++) {
            if ((c[j - i - 1]^c[0]) != 0){
                max = Math.max(max, Math.abs(j - i - 1));
                break;
            }
        }
        return max;
    }
}