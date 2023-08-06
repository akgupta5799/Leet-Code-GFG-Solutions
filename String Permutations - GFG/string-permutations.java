//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<Integer> check = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        helper(0, check, ans, s, temp);
        Collections.sort(ans);
        return ans;
    }
    public void helper(int i, ArrayList<Integer> check, ArrayList<String> ans, String s, StringBuilder temp)
    {
        if(temp.length() == s.length())
        {
            ans.add(temp.toString());
            return;
        }
        
        for(int k=0; k<s.length(); k++)
        {
            if(!check.contains(k))
            {
                temp.append(s.charAt(k));
                check.add(k);
                helper(k+1, check, ans, s, temp);
                temp.deleteCharAt(temp.length()-1);
                check.remove(check.size()-1);
            }
        }
    }
}
