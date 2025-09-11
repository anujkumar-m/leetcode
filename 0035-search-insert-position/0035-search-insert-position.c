int searchInsert(int* nums, int numsSize, int target) {
    int i=0,index=0;;
    while(i<numsSize){
        if(nums[i]==target){
            return i;
        }

        if(nums[i]>target){
            return i;
        }
        i++;
    }
    return i;

}