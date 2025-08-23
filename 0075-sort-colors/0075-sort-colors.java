class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0,lst=n-1,strt=0;
        while(i<=lst){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[strt];
                nums[strt]=temp;
                ++strt;
                ++i;
            }
            else if(nums[i]==1) ++i;
             else {
                int temp=nums[i];
                nums[i]=nums[lst];
                nums[lst]=temp;
                --lst;
            }
            //i++;
            
        }
        
    }
}