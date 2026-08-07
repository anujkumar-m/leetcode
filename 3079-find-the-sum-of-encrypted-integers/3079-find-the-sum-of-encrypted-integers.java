class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int num = 0;
        for(int n :  nums){
            if(n > 9)
                num += max(n);
            else num += n;
        }
        return num;
    }
    int max(int num){
        int max = 0;
        int count = 0;
        while(num > 0){
            max = Math.max(max, num % 10);
            num /= 10;
            count++;
        }
        return genNum(max, count);
    }
    int genNum(int max, int count){
        int num = 0;
        while(count-- > 0){
            num = num * 10 + max;
        }
        return num;
    }
}