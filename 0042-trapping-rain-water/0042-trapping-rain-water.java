class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int []lm=new int[n];
        int []rm=new int[n];
        lm[0]=h[0];
        rm[n-1]=h[n-1];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(h[i],lm[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.max(h[i],rm[i+1]);
        }
        int res=0;
         for(int i=1;i<n;i++){
            res+=Math.min(lm[i],rm[i])-h[i];
        }
        return res;

    }
}