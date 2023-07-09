//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Time limit exceeded
        // Arrays.sort(arr);
        // int res = 1;
        // for(int i=0;i<size;i++){
        //     if(res==arr[i]){
        //         res++;
        //     }
        // }
        // return res;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // For smallest positive number
        for(int i=1;i<=size;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return size+1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends