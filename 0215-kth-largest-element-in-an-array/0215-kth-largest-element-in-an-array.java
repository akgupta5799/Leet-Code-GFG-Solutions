class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();// creating min heap
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}

/*
How to create max heap:

PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

>> In max heap, maximum value will be on top always.

When to use max heap:

Whenever the question asked about smallest...
*/

/*
How to create min heap:

PriorityQueue<Integer> minHeap = new PriorityQueue<>();

>> In min heap, minimum value will be on top always.

When to use min heap:

Whenever the question asked about largest, greatest...
*/