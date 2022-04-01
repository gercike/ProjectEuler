import java.time.Duration;
import java.time.Instant;

public class The10001stPrime {

    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println(getTheNthPrimeInteger(10001));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis() + " milliseconds");
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
