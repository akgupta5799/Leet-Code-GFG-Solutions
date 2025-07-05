class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int maxLucky = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                int lucky = entry.getKey();
                maxLucky = Math.max(lucky, maxLucky);
            }
        }
        return maxLucky;
    }
}