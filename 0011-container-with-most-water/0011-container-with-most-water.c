int maxArea(int* height, int Size) {
    int i=0,max=0,j=Size-1;
    while(j>i){
        int t=height[i];
        if(t>height[j]) t=height[j];
        t*=(j-i);
        if(max<t) max=t;
        if(height[i]<height[j]) i++;
        else j--;
    }
    return max;
}