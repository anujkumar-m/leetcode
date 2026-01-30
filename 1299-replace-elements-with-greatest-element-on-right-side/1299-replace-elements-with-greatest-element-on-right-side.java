class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=arr.length-1,max=-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=max;
            if(curr>max) max=curr;
        }
        return arr;
    }
}