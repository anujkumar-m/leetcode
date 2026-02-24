class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int row = rooms.size();
        boolean vis[] = new boolean[row];
       check(rooms,0,vis);
       for(boolean flag : vis)if(!flag)return false;
       return true;
    }
    public void check(List<List<Integer>> room,int src, boolean[] vis){
        vis[src] = true;
        for(int n : room.get(src)){
            if(!vis[n]){
                check(room,n, vis);
            }
        }

    }
}