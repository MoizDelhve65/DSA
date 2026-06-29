class Solution {
    public int countPrimes(int n) {
        boolean iscomp[] = new boolean[n];
        int count = 0;
        if(n <= 2) count = 0;
        for(int i = 2; i * i < n; i++) {
            if(!iscomp[i]) for(int j = i * i; j < n; j += i) iscomp[j] = true;

            
        }
        for(int i = 2; i < n; i++) if(!iscomp[i]) count++;
        return count;
    }
}