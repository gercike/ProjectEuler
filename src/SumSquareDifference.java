public class SumSquareDifference {
    public static void main(String[] args) {
        System.out.println(findSumSquareDifference(100));
    }

    static int findSumSquareDifference(int number) {
        return getSquareOfSumOfFirstNNaturalNumbers(number) - getSumOfSquaresOfFirstNNaturalNumbers(number);
    }

    static int getSumOfSquaresOfFirstNNaturalNumbers(double N) {
        if (N == 1) {
            return 1;
        }
        return (int) (Math.pow(N, 2) + getSumOfSquaresOfFirstNNaturalNumbers(N - 1));
    }

    static int getSquareOfSumOfFirstNNaturalNumbers(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            result += i;
        }
        return (int) Math.pow(result, 2);
    }
}
