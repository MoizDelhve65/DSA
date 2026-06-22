class Solution {
    public int search(int[] nums, int target) {
        boolean flag = true;
        int ot = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                flag = false;
                ot = i;
                break;
            }
        }
        if (flag == true) return -1;
        else return ot;

        
    }
}