import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger anum = new BigInteger(a,2);
        BigInteger bnum = new BigInteger(b,2);
        BigInteger add = anum.add(bnum);
        return add.toString(2);
    }
}