class Solution {
    public int numTeams(int[] rating) {
        // Brute Force
        // int n = rating.length;
        // int count = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(((rating[i] < rating[j]) && (rating[j] < rating[k])) || ((rating[i] > rating[j]) && (rating[j] > rating[k]))){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // return count;

        // Another Approach Time Complexity: O(n^2)
        /* logic choose j from 1 index to n-2 means excluding first and last element
            then try to find smaller and greater elements to rating[j] left side and right side.
            and add to res by calculating smallerElementsLeft * greaterElementsRight and 
            greaterElementsLeft * smallerElementsRight.*/

        int n = rating.length;
        int res = 0;
        for(int j=1;j<n-1;j++){
            int smallerElementsLeft = 0;
            int greaterElementsLeft = 0;
            for(int i=0;i<j;i++){
                if((rating[i] < rating[j])){
                    smallerElementsLeft++;
                }
                if(rating[i] > rating[j]){
                    greaterElementsLeft++;
                }
            }
            int smallerElementsRight = 0;
            int greaterElementsRight = 0;
            for(int k=j+1;k<n;k++){
                if(rating[k] < rating[j]){
                    smallerElementsRight++;
                }
                if(rating[k] > rating[j]){
                    greaterElementsRight++;
                }
            }
            res += (smallerElementsLeft * greaterElementsRight) + (greaterElementsLeft * smallerElementsRight);
        }
       // res += (smallerElementsLeft * greaterElementsRight) + (greaterElementsLeft * smallerElementsRight);
        return res;
    }
}