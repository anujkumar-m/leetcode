int numIdenticalPairs(int* nums, int n) {
    int c=0;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(nums[i]==nums[j]&&i!=j){
                c++;
            }
        }
        
    }
    return c;
}