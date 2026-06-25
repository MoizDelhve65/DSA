class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();

        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(nums[i])) {
                flag = true;
                break;
            }
            else list.put(nums[i],i);
        }
        return flag;
        
    }
}