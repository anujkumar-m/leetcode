class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder s1 = new StringBuilder(String.format("%04d", num1));
        StringBuilder s2 = new StringBuilder(String.format("%04d", num2));
        StringBuilder s3 = new StringBuilder(String.format("%04d", num3));
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < 4; i++){
            s.append(Math.min(s1.charAt(i) - '0', Math.min(s2.charAt(i) - '0', s3.charAt(i) - '0')));
        }
        return Integer.parseInt(new String(s));
    }
}