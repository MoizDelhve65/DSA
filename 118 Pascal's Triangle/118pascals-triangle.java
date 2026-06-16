import java.math.BigInteger;
class Solution {
    public static BigInteger fact(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = n; i > 0; i--) fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
    public static long comb(int a, int b) {
        BigInteger numerator = fact(a);
        BigInteger denominator = fact(a - b).multiply(fact(b));
        return numerator.divide(denominator).intValue();
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalarr = new ArrayList<>();
        
        for (int i = 1; i <= numRows; i++) {
            List<Integer> interm = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                interm.add((int)comb(i-1, j-1));
            }
            finalarr.add(interm);
        }
        return finalarr;
        
    }
}