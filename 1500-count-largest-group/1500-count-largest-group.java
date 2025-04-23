class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            int num = i;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
            maxValue = Math.max(maxValue, map.get(sum));
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue){
                count++;
            }
        }
        return count;
    }
}