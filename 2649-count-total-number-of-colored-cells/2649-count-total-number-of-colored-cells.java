class Solution {
    public long coloredCells(int n) {
        long res = 1;
        for(int i=0;i<n;i++){
            res += 4*i;
        }
        return res;
    }
}