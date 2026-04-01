class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int n : asteroids) {
            if (n > 0)
                st.push(n);

            else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < -n) {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(n);
                }
                if (st.peek() == -n)
                    st.pop();
            }
        }
        int[] nums = new int[st.size()];
        int n = st.size() - 1;

        while (!st.isEmpty()) {
            nums[n--] = st.pop();
        }
        return nums;

    }
}