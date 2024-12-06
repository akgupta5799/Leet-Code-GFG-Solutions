class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int res = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                res++;
                sum += i;
                if(sum > maxSum){
                    break;
                }
            }
            if(i == n) res++;
             
        }
        return res - 1;
    }
}