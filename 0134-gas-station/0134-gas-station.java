class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totCos=0,ans=0,gain=0;

        for(int i=0;i<gas.length;i++){
            totCos+=gas[i]-cost[i];
            gain=gain+gas[i]-cost[i];
            if(gain<0){
                ans=i+1;
                gain=0;    
            }
        }
        return totCos>=0?ans:-1;
    }
}