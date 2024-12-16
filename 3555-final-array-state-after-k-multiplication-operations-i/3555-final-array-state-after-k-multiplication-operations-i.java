class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])
        );
        for(int i=0;i<n;i++){
            pq.add(new int[]{nums[i], i});
        }
        while(k-- > 0){
            int[] temp = pq.poll();
            int val = temp[0];
            int idx = temp[1];
            val *= multiplier;
            nums[idx] = val;
            pq.add(new int[]{val, idx});
        }
        return nums;
    }
}