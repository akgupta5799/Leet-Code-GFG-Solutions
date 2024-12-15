class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area;
        int maxArea = 0;
        while(start < end){
            area = Math.min(height[start],height[end]) * (end - start);
            if(area > maxArea){
                maxArea = area;
            }
            if(Math.min(height[start],height[end]) == height[start]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
}