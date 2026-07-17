class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String arr[] = s.split(" ");
        String newarr[] = new String[arr.length];
        int k = 0;

        for(int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals(""))
                newarr[k++] = arr[i];

        }
        String finalarr[] = new String[k];
        for (int i = 0; i < k; i++) {
            finalarr[i] = newarr[i];
        }
        String result = String.join(" ", finalarr);
        return result;
        
        
    }
}