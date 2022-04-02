public class SummationOfPrimes {
    public static void main(String[] args) {
        System.out.println(getSumOfPrimesUnderN(2000000));
    }

    static long getSumOfPrimesUnderN(int n) {
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (LargestPrimeFactor.isThisNumberPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
