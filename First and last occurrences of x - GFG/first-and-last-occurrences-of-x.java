//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        int l = 0;
        int r = n-1;
        first(arr, n, x, 0, n-1);
        last(arr, n, x, 0, n-1);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
    
    int a = -1;
    public void first(int[] arr, int n, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                a = mid;
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
    }
    
    int b = -1;
    public void last(int[] arr, int n, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                b = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
    }
    
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends