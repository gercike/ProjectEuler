public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(findSumOfEvenFibonacciNumbers(4000000));
    }

    static int findSumOfEvenFibonacciNumbers(int number) {
        int A = 1;
        int B = 2;
        int result = 2;
        while (A <= number && B <= number) {
            A = A + B;
            B = A + B;
            if (A % 2 == 0 && A <= number) {
                result += A;
            }
            if (B % 2 == 0 && B <= number) {
                result += B;
            }
        }
        return result;
    }
}
