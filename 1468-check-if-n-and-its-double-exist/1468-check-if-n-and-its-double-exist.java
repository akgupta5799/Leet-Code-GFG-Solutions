class Solution {
    public boolean checkIfExist(int[] arr) {
        // Brute Force O(n^2)
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(i!=j && arr[i] == 2*arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 && map.containsKey(2*arr[i])){
                return true;
            }
            if(arr[i] == 0 && map.get(arr[i]) > 1){
                return true;
            }
        }
        return false;
    }
}