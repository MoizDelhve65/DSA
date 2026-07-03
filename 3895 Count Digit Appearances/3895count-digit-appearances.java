class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += count(nums[i],digit);
        }
        return count;

        
    }
    public static int count(int n, int m) {
        int temp = n;
        int count = 0;
        int dig = 0;
        while (temp > 0) {
            dig = temp % 10;
            if (dig == m) count++;
            temp = temp / 10;
        }
        return count;
    }
}