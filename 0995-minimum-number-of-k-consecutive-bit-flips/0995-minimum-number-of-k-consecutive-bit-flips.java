class Solution {
    public static int minKBitFlips(int[] arr, int k) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        int flips = 0;

        for (int i = 0; i < n; i++) {

            // Remove expired flips (out of window)
            if (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }

            // Get current value after flips
            int current = arr[i];
            if (q.size() % 2 != 0) {
                current = 1 - current;
            }

            // If still 0 → must flip
            if (current == 0) {
                if (i + k > n) {
                    return -1;
                }

                q.offer(i); // start flip at index i
                flips++;
            }
        }

        return flips;
    }

}