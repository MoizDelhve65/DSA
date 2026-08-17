class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int len = Math.max(arr.length, arr2.length);
        int flag = 1;
        if(arr.length != arr2.length)
            return false;
        
        for (int i = 0; i < len; i++) {
            if(arr[i]!=(arr2[i])) {
                flag = 0;
                break;
            }

        }
        if(flag == 1) return true;
         else return false;

        
    }
}