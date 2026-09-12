class Solution {
    public int totalNumbers(int[] d) {
        int n = d.length;
        Set<Integer> num = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    if (i != j && j != k && i != k
                            && d[i] != 0
                            && d[k] % 2 == 0) {

                        int t = d[i] * 100 + d[j] * 10 + d[k];
                        num.add(t);
                    }
                }
            }
        }

        return num.size();
    }
}