class Solution {
    public int trap(int[] height) {
        int max = height[0];
        int maxIndex = -1;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }
        int currMax = height[0];
        int count = 0;
        for (int i = 0; i < maxIndex; i++) {
            currMax = Math.max(height[i],currMax);
            if (height[i] != currMax) {
                count += (currMax - height[i]);
            }
        }
        currMax = height[height.length - 1];
        for (int i = height.length - 1; i > maxIndex; i--) {
            currMax = Math.max(height[i],currMax);
            if (height[i] != currMax) {
                count += (currMax - height[i]);
            }
        }
        return count;
        
    }
}