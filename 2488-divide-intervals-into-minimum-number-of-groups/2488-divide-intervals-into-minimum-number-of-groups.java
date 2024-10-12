class Solution {
    public int minGroups(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        // Create Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // traverse the on each intervals
        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];

            if(!pq.isEmpty() && start > pq.peek()){
                pq.poll();
            }
            pq.offer(end);
        }
        return pq.size();
    }
}