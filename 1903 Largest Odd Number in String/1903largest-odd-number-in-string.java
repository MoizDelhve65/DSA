class Solution {
    public String largestOddNumber(String num) {
        char arr[] = num.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if((int)arr[i] % 2 == 0) {
                arr[i] = '\0';
            } else break;
        }
        String nums = new String(arr).replace("\0", "");

        return nums;
         
    }
}