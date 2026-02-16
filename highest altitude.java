class Solution {
    public int largestAltitude(int[] gain) {

        int altitude = 0;      // current altitude
        int max = 0;           // highest altitude so far

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];  // update altitude
            if (altitude > max) {
                max = altitude;             // update max AFTER addition
            }
        }

        return max;
    }
}
