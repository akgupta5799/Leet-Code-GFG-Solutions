class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],i);
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(2*arr[i])){
        //         return true;
        //     }
        // }
        // return false;
    }
}