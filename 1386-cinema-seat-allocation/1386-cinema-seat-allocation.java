class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
         Map<Integer, int[]> seatsMap = new HashMap<>();
        
        for (int[] num : reservedSeats) {
            int i = num[0] - 1;
            int j = num[1] - 1;
            seatsMap.putIfAbsent(i, new int[10]);
            seatsMap.get(i)[j] = 1;
        }
        
        int ans = (n - seatsMap.size()) * 2;
        

        for (int[] seats : seatsMap.values()) {
            boolean left = true;
            boolean right = true;
            boolean middle = true;

            for(int j = 1; j <= 4; j++){
                if(seats[j] == 1) 
                    left = false;
            }
            for(int j = 3; j <= 6; j++){
                if(seats[j] == 1) 
                    middle = false;
            }
            for(int j = 5; j <= 8; j++){
                if(seats[j] == 1) 
                    right = false;
            }

            if(left && right) ans += 2;
            else if(left || right || middle) ans++;
        }
        return ans;
        
    }
}