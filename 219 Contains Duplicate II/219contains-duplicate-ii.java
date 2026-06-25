class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> list = new HashMap<>();
        boolean flag = false;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(nums[i])) {
                l = list.get(nums[i]);
                if (Math.abs(l-i) <= k) flag = true;
            }
            list.put(nums[i],i);
        }
        return flag;
        
    }
}