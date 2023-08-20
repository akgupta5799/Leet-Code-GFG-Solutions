//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

// class Solution
// {
//   public static Node reverse(Node head, int k)
//     {
//         Node prev=null;
//         Node curr=head;
//         Node next=null;
//         int count=0;
//         while(count<k && curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//             count++;
//         }
//         if(next!=null){
//             head.next=reverse(next,k);
//         }
//         return prev;
//     }
// }

class Solution
{
    public static Node reverse(Node node, int k)
    {
        return helper(node,k);
    }
   public static Node helper(Node head, int k) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (count < k) return reverseList(head);

        Node temp1 = head;
        for (int i = 1; i < k; i++) {
            temp1 = temp1.next;
        }
        Node temp2 = temp1.next;
        temp1.next = null;
        head = reverseList(head);

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = helper(temp2, k);

        return head;
    }
    private static Node reverseList(Node head){
        Node prev = null;
        Node fwd = null;
        Node curr= head;
        
        while(curr!=null){
           fwd = curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    
}
