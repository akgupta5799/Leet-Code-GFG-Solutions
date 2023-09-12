//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
        // Time Limit Exceeded
        
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=1;i<N;i++){
        //     if(N%i==0){
        //         list.add(i);
        //     }
        // }
        // int sum = 0;
        // for(int i=0;i<list.size();i++){
        //     sum += list.get(i);
        // }
        // if(sum==N){
        //     return 1;
        // }
        // return 0;
        
        if(N==1) return 0; // 1 is not a perfect number.
        long sum = 1; // Because every number is divisible by 1.
        
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                //   We will add i and N/i to the sum because both are divisor of N.
                sum += i;  
                sum += N/i;
            }
        }
        
        if(sum==N) return 1;
        return 0;
    }
};