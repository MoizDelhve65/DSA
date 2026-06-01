class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int pi = 0, ni = 0;
        for (int i = 0; i < nums.length; i++) { 
            if(nums[i] > 0) pos[pi++] = nums[i];
            else neg[ni++] = nums[i];

        }
        int t = 0, r = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            nums[i] = pos[t];
            t++;

        }
        for (int i = 1; i < nums.length; i = i + 2) {
            nums[i] = neg[r];
            r++;
        }
        return nums;
        
    }
}