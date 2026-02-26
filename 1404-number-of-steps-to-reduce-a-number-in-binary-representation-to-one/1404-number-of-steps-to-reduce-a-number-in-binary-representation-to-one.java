import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s, 2);
        int count = 0;
        while (!num.equals(BigInteger.ONE)) {
            if (num.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                num =num.add(BigInteger.ONE);
            } else {
                num = num.divide(BigInteger.TWO);
            }
                count++;
        }
        return count;

    }
}