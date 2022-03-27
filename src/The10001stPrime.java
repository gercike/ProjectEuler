public class The10001stPrime {
    public static void main(String[] args) {
        System.out.println(getTheNthPrimeInteger(10001));
    }

    static int getTheNthPrimeInteger(int n) {
        int number = 1;
        int counter = 0;
        while (counter < n) {
            number++;
            if (LargestPrimeFactor.isThisNumberPrime(number)) {
                counter++;
            }
        }
        return number;
    }
}
