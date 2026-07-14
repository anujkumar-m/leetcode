class Solution {
    public int getLeastFrequentDigit(int n) {
        int []freq = new int[10];
        while(n > 0){
            freq[n % 10]++;
            n /= 10;
        }
        int count = Integer.MAX_VALUE;
        int val = 0;
        for(int i = 0; i < 10; i++){
            if(freq[i] > 0 && freq[i] < count){
                count = freq[i];
                val = i;
            }
        }
        return val;
    }
}