class Solution {
    public long coloredCells(int n) {
        // long res = 1;
        // for(int i=0;i<n;i++){
        //     res += 4*i;
        // }
        // return res;

        //Using formula
        // 1 + (4x1) + (4x2) + (4x3) + ... + (4x(n-1)) 
        // 1 + 4(1+2+3+4+...+(n-1)) = 1 + 2n(n-1)
        return 1 + (long) n * (n - 1) * 2;
    }
}