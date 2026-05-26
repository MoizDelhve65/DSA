class Solution {
    public int removeDuplicates(int[] nums) {
        int  k = 0;
        //2 ptr approach, one fast(loop) and one slow for unique
        for(int i = 0; i < nums.length; i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        return (k+1);   
    }
}
