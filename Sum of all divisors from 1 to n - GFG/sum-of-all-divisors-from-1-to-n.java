//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        // code here
//         for any no. N = 1 appears  - N/1 times
//                           2 appears - N/2 times 
//                           m appears - N/m times 
// and so on 

// eg for N=4
// 1 appears = 4/1 = 4 times
// 2 appears = 4/2 = 2 times
// 3 appears = 4/3 = 1 time
// 4 appears = 4/4 = 1 time

        long sum = 0;
        for(int i=1;i<=N;i++){
            sum += i*(N/i);
        }
        return sum;
    }
}