import java.util.Arrays;
class Solution {
    public int maximumGap(int[] nums) {
        //need to put a sorting algorithm of linear complexity here!!
        //first trial: cheating with log complexity
        Arrays.sort(nums);

        int gap = 0, maxGap = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            gap = Math.abs(nums[i] - nums[i + 1]);
            maxGap = Math.max(gap, maxGap);
        }
        if(nums.length == 1) return 0;
        else return maxGap;
         
    }
}