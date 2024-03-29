//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.kthDigit(A,B,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long kthDigit(int A,int B,int K){
        long power =(long)Math.pow(A,B);
        long res = 0;
        for(int i=0;i<K;i++){
           res = power%10;
           power = power/10;
        }
        return res;
    }
}