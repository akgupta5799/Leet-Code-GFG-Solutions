class MyCircularDeque {
    Deque<Integer> dequeue; int size;
    public MyCircularDeque(int k) {
        size = k;
        dequeue = new ArrayDeque<>();
    }
    
    public boolean insertFront(int value) {
        if(dequeue.size()<size){
            dequeue.addFirst(value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(dequeue.size()<size){
            dequeue.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(!dequeue.isEmpty()){
            dequeue.removeFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!dequeue.isEmpty()){
            dequeue.removeLast();
            return true;
        }
        return false;
    }
    
    public int getFront() {
        if(!dequeue.isEmpty()){
            return dequeue.peekFirst();
        }
        return -1;
    }
    
    public int getRear() {
        if(!dequeue.isEmpty()){
            return dequeue.peekLast();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return (dequeue.isEmpty());
    }
    
    public boolean isFull() {
        if(dequeue.size()==size)
            return true;
        return false;
    }
}