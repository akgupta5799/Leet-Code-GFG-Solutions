class Solution {
    public boolean checkIfPangram(String sentence) {
        // In two traversal
        // int arr[] = new int[26];
        // for(char ch : sentence.toCharArray()){
        //     int index = ch - 'a';
        //     arr[index]++;
        // }
        // for(int count : arr){
        //     if(count == 0){
        //         return false;
        //     }
        // }
        // return true;

        //In one traversal
        int arr[] = new int[26];
        int count = 0;
        for(char ch : sentence.toCharArray()){
            int index = ch - 'a';
            if(arr[index] == 0){
                arr[index]++;
                count++;
            }
        }
        return count == 26;
    }
}