// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
           
//         Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
//         Stack<Integer> stack = new Stack<>();
//         for (int num : nums2) {
//             while (!stack.isEmpty() && stack.peek() < num)
//                 map.put(stack.pop(), num);
//             stack.push(num);
//         }   
//         for (int i = 0; i < nums1.length; i++)
//             nums1[i] = map.getOrDefault(nums1[i], -1);
//         return nums1;
//     }
    
// }

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int ng = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    found = true;
                } else if (found && nums2[j] > target) {
                    ng = nums2[j];
                    break;
                }
            }
            res[i] = ng;
        }

        return res;
    }
}
