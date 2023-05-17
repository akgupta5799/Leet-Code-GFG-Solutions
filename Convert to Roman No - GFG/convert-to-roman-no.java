//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		int num[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<num.length;i++){
		    while(n >= num[i]){
		       sb.append(roman[i]);
		       n -= num[i];
		    }
		}
		return sb.toString();
	}
}