class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean[] set=new boolean[n+1];
        for(int i:nums){
            if(i>0 && i<=n){
                set[i]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!set[i]) return i;
        }
        return n+1;
    }
}