class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        //TLE
        // int n = values.length;
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         max = Math.max(max, (values[i]+values[j]+i-j));
        //     }
        // }
        // return max;

        int n = values.length;
        int res = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// max heap
        pq.offer(values[0] + 0);
        for(int j=1;j<n;j++){
            res = Math.max(res, (values[j] - j) + pq.peek());
            pq.offer(values[j] + j);
        }
        return res;
    }
}