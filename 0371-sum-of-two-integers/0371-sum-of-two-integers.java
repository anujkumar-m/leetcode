class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carr=a&b;
            a=a^b;
            b=carr<<1;
        }
        return a;
    }
}