class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        long score = 0;
        while(k > 0){
            int temp = pq.poll();
            score += temp;
            double x = (double)temp/3;
            pq.add((int)(Math.ceil(x)));
            k--;
        }
        return score;
    }
}