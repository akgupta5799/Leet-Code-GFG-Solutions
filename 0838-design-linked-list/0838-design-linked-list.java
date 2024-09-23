class MyLinkedList {
	Node head;
	int length;
    public class Node{
        int val;
        Node next;
        
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    public int get(int index) {
        if(index >= length)
        	return -1;
        int count = 0;
        Node temp = head;
        while(count < index) {
        	count++;
        	temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }
    
    public void addAtTail(int val) {
        if(head == null) {
        	addAtHead(val);
        }else {
        	Node temp = head;
        	while(temp.next != null)
        		temp = temp.next;
        	Node newNode = new Node(val);
        	temp.next = newNode;
        	length++;
        }
    }
    
    public void addAtIndex(int index, int val) {
    	if(index > length)
    		return;
        if(index == 0)
        	addAtHead(val);
        else {
        	int count = 1;
        	Node temp = head;
        	while(count < index) {
        		temp = temp.next;
        		count++;
        	}
        	Node newNode = new Node(val);
        	// Node next = temp.next;
        	newNode.next = temp.next;
            temp.next = newNode;
        	length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index >= length)
        	return;
        if(index == 0) {
        	head = head.next;
        	length--;
        }else {
        	int count = 1;
        	Node temp = head;
        	while(count < index) {
        		count++;
        		temp = temp.next;
        	}
        	temp.next = temp.next.next;
        	length--;
        }
    }
}