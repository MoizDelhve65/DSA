class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = 0;
        int smallestIndex = -1;
        int bptIndex = -1;
        int temp = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                bptIndex = i;
                break;
            }
        }
        if (bptIndex != -1) {
            smallestIndex = -1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[bptIndex]) {
                    smallestIndex = i;
                    break;
                }

            }
            temp = nums[bptIndex];
            nums[bptIndex] = nums[smallestIndex];
            nums[smallestIndex] = temp;

        }
        //reverse the array after the breakpoint
        int left = bptIndex + 1;
        int right = nums.length - 1;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}