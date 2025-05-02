class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Cisco Interview
        int timeLine[] = new int[1002];
        for(int i=0;i<trips.length;i++){
            timeLine[trips[i][1]] += trips[i][0];
            timeLine[trips[i][2]] -= trips[i][0];
        }

        int currPassenger = 0;
        for(int i=0;i<1002;i++){
            currPassenger += timeLine[i];
            if(currPassenger > capacity){
                return false;
            }
        }
        return true;
    }
}