class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {

        for (int i = 0; i < f.length; i++) {

            if (f[i] == 0) {
                int left = (i == 0) ? 0 : f[i - 1];
                int right = (i == f.length - 1) ? 0 : f[i + 1];
                if (left == 0 && right == 0) {
                    n--;
                    f[i] = 1;
                }

            }
        }
        System.out.print(n);
        return n <= 0;

    }
}