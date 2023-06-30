//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isDivisible(String s) {
        // Not working for large input
        // int decimal = 0;
        // int power = 0;
        // for(int i=s.length()-1;i>=0;i--){
        //     char ch = s.charAt(i);
        //     if(ch=='1'){
        //         decimal += Math.pow(2,power);
        //     }
        //     power++;
        // }
        // if(decimal % 3 == 0){
        //     return 1;
        // }
        // return 0;
        
        /* Note: To determine if a binary number is a multiple of 3, 
        we can use the concept of the divisibility rule for 3.
        According to the rule, a number is divisible by 3 if and only if 
        the difference between the sum of its digits at even positions and
        the sum of its digits at odd positions is divisible by 3. */
        
        int n = s.length();
        int evenSum = 0;
        int oddSum = 0;
        for(int i=n-1;i>=0;i--){
            int bit = s.charAt(i) - '0';
            // if the position is even
            if((n-i)%2==0){
                evenSum += bit;
            }else{
                oddSum += bit;
            }
        }
        int diff = Math.abs(evenSum - oddSum);
        if(diff % 3==0){
            return 1;
        }
        return 0;
    }
}