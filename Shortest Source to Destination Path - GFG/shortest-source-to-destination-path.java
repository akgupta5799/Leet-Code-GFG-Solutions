//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


class Solution {

    int shortestDistance(int N, int M, int A[][], int X, int Y) {

        if(A[0][0] == 0) return -1;

        int res = bfs(X, Y, A);

        return res == (int)Math.pow(10,9) ? -1 : res;

        

    }

    int bfs(int x, int y, int arr[][]) {

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0,0,0});

        arr[0][0] = 0;

        while(!q.isEmpty()){

            int n = q.size();

            for(int p = 0 ; p<n ; p++){

                int[] curr = q.poll();

                int i = curr[0], j = curr[1], c = curr[2];

                if(i == x && j == y) return c;

                if(i>0 && arr[i-1][j] == 1){

                    arr[i-1][j] = 0;

                    q.add(new int[]{i-1, j, c+1});  

                } 

                if(j>0 && arr[i][j-1] == 1){

                       arr[i][j-1] = 0;

                       q.add(new int[]{i, j-1, c+1});

                }

                if(i<arr.length-1 && arr[i+1][j] == 1){

                       arr[i+1][j] = 0;

                       q.add(new int[]{i+1, j, c+1});

                } 

                if(j<arr[0].length-1 && arr[i][j+1] == 1){

                        arr[i][j+1] = 0;

                        q.add(new int[]{i, j+1, c+1});

                }  

            }

        }

        return -1;

    }

};