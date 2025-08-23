class Solution {
    public int maxArea(int[] height) {
        int  max=0,n=height.length;
        int i=0,j=n-1,t=0;
        while(j>i){
            t=Math.min(height[j],height[i])*(j-i);
            max=Math.max(max,t);
            if(height[i]<height[j]) ++i;
            else --j;
        }
        return max;
    }
}