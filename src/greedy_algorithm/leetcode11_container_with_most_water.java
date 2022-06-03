class Solution {
    //time O(n), space O(1)
    //traverse with two pointers, move pointer with shorter length inward per iteration
    public int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        int rightIndex = height.length - 1;
        int leftIndex = 0;
        while(leftIndex != rightIndex){
            int width = rightIndex - leftIndex;
            int currArea = width * Math.min(height[rightIndex], height[leftIndex]);
            if(currArea > area) area = currArea;
            if(height[rightIndex] < height[leftIndex]){
                rightIndex--;
            }
            else{
                leftIndex ++;
            }
        }
        return area;
        }
}