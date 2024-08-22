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

/* num = 5 ------------------------------  1 0 1
fliping right most bit by taking XOR with  0 0 1
                                          --------
                                           1 0 0
fliping second bit by taking XOR with      0 1 0  
                                          --------
                                           1 1 0
fliping first bit by taking XOR with       1 0 0                                     
                                          --------
                                           0 1 0 == 2
*/