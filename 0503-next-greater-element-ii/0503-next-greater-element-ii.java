class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int []res = new int[n];
        int []arr = new int[n*2];
        for(int i = 0; i < n; i++)
            arr[i] = arr[i+n] = nums[i];
        for(int i = 0; i < n; i++){
            res[i] = -1;
            for(int j = i+1; j < n*2; j++){
                if (arr[j] > nums[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }

        return res;
    }
}