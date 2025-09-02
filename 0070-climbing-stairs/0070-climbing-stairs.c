int f[46]={0,1,2};
int climbStairs(int n) {
    if(n==0 || n==1) return n;
    if(f[n]!=0) return f[n];
    f[n]=climbStairs(n-1)+climbStairs(n-2);
    return f[n];
}