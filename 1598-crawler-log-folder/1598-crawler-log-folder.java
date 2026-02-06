class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for(String str : logs){
            if(str.equals("../"))
            {
                if(depth>0)
                    depth--;
            } 
            else if(!str.equals("./")) depth++;
        }
        return depth;
    }
}