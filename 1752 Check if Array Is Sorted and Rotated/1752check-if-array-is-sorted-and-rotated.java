class Solution {
    public boolean check(int[] nums) 
    {
        //logic is that if rotated at one point first element is moer than second only ONCE
        int k = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length]) k++;

        }
        if (k==1||k==0) return true;
        return false;
        
    }
}