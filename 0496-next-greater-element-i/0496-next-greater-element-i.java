class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap();
        Stack<Integer> s=new Stack();
        int[] res=new int[nums1.length];
        for(int ele:nums2){
            while(!s.isEmpty() && s.peek()<ele){
                hm.put(s.pop(),ele);
            }
            s.push(ele);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=hm.containsKey(nums1[i])?hm.get(nums1[i]):-1;
        }
        return res;
    }
}