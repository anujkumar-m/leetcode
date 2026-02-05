class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            int ind = nums[i];

            if(ind > 0){
                int temp = (i + ind)%n;
                arr[i] = nums[temp]; 
            }
            else if(ind<0){
                int temp = ((i + ind) % n + n) % n;
                arr[i] = nums[temp];
            }
            else{
                arr[i] = nums[i];
            }

        }
        return arr;
    }
}