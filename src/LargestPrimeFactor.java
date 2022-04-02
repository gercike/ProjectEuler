import java.time.Duration;
import java.time.Instant;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getTheLargestPrimeFactorOf(600851475143L));
    }

    static double getTheLargestPrimeFactorOf(long number) {
        double factor = 3;
        while (number / factor != 1) {
            if (isThisNumberPrime(factor) && number % factor == 0) {
                number /= factor;
                factor++;
                continue;
            }
            if (factor > number) {
                return -1;
            }
            factor++;
        }
        return factor;
    }

    static boolean isThisNumberPrime(double number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0 && i != number) {
                return false;
            }
        }
        return true;
    }
}
