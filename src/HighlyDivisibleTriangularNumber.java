import java.util.HashSet;

public class HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        System.out.println(findFirstTriangularNumberWithAtLeastNDivisor(500));
    }

    static HashSet<Integer> getEveryDivisorOfNumber(int number) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(number);
        for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                hashSet.add(i);
                hashSet.add(number / i);
            }
        }
        return hashSet;
    }

    static int findFirstTriangularNumberWithAtLeastNDivisor(int N) {
        for (int i = 1, triangularNumber = 0; true; i++) {
            triangularNumber += i;
            if (getEveryDivisorOfNumber(triangularNumber).size() >= N) {
                return triangularNumber;
            }
        }
    }
}
