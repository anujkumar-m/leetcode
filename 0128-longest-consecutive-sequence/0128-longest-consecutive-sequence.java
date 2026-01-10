class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ls=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currnum=num;
                int currstk=1;
                while(set.contains(currnum+1)){
                    currnum+=1;
                    currstk+=1;
                }
            ls=Math.max(ls,currstk);
            }
        }
        return ls;
    }
}