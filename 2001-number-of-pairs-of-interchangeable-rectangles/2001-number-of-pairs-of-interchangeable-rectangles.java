class Solution {
    public long interchangeableRectangles(int[][] nums) {
        long c=0;
        Map<Double, Integer> map = new HashMap<>();
        for(int[] a:nums){
            double s=(double)a[0]/a[1];
            c=c+map.getOrDefault(s,0);
            map.put(s, map.getOrDefault(s,0)+1);
        }
        return c;
    }
}