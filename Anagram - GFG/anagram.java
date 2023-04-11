//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String s,String t)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            if(map.get(t.charAt(i))==1){
                map.remove(t.charAt(i));
            }
            else{
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            
        }
        if(map.size()==0) return true;
        else return false;
       
   
        
    }
}