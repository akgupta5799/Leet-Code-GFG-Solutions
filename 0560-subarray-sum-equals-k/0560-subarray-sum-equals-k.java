class Solution {
    public int subarraySum(int[] nums, int k) {
        // Brute force
        // int count = 0;
        // for(int i=0;i<nums.length;i++){
        //     int sum = 0;
        //     for(int j=i;j<nums.length;j++){
        //         sum = sum + nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    



// Optimal Solution using HashMap

    

       int count=0;
        
         Map<Integer, Integer> map = new HashMap<>();
          int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k)count++;
         if(map.containsKey(sum-k)){
             count+= map.get(sum-k);
         }
         map.put(sum,map.getOrDefault(sum,0)+1);
         
        }
          
         return count; 
    }
}