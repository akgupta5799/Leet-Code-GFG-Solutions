//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// Time Limit Exceeded

// class Solution{
//     static int matrixMultiplication(int N, int arr[])
//     {
//         return MCM(arr,1,N-1); // i=1,j=n-1
//     }
//     public static int MCM(int arr[],int i, int j){
//         int min = Integer.MAX_VALUE;
//         if(i>=j) return 0;
//         for(int k=i;k<=j-1;k++){
//             int tempAns = MCM(arr,i,k) + MCM(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
//             if(tempAns < min){
//                 min = tempAns;
//             }
//         }
//         return min;
//     }
// }

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][] = new int[N][N];
        
        for(int a[] : dp){
            Arrays.fill(a, -1);
        }
        
        return findMinCost(arr, 1, N-1, dp);
    }
    
    static int findMinCost(int arr[], int i, int j, int dp[][]){
        //base case
        if(i == j){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int ans = Integer.MAX_VALUE;
        
        for(int k=i; k<=j-1; k++){
            int cost1 = findMinCost(arr, i, k, dp);
            int cost2 = findMinCost(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        
        dp[i][j] = ans;
        return ans;
    }
}