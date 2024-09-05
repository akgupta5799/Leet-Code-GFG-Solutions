class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }    
            // Update n with the sum of the squares of its digits    
            n = sum;
        }
        // If n is 1, it is a happy number; otherwise, it is not
        return n == 1;
    }
}