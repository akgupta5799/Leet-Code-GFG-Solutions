class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        while(k > 0){
            int top = pq.poll();
            int temp =(int)(Math.sqrt(top));
            //System.out.println(temp);
            pq.add(temp);
            k--;
        }
        long res = 0;
        for(int val : pq){
            res += val;
        }

        return res;
    }
}