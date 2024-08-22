class Solution {
    public int findComplement(int num) {
        // Count the number of bit in num
        int numOfBits = (int)(Math.log(num)/Math.log(2)) + 1; // learn it.

        for(int i=0;i<numOfBits;i++){
            num = num ^ (1<<i);
        }
        return num;
    }
}