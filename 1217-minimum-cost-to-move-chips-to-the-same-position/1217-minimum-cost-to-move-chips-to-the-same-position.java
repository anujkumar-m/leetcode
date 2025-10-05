class Solution {
    public int minCostToMoveChips(int[] pos) {
        int i=0,j=0;
        for(int n : pos){
            if(n%2==0) i++;
            else j++;
        }
        return Math.min(i,j);
    }
}