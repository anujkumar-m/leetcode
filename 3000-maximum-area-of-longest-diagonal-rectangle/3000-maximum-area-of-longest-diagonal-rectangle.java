class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxdia=0,maxarea=0;
        for(int []d:dimensions){
            int l=d[0];
            int w=d[1];
            int dg=l*l + w*w;
            int area=l*w;
            if(dg>maxdia){
                maxdia=dg;
                maxarea=area;
            }
            else if(dg==maxdia){ maxarea=Math.max(area,maxarea);}
        }
        return maxarea;
    }
}