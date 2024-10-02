class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int rank = 1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}